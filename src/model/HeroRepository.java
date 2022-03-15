package model;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Hero;
import entity.Incident;

public class HeroRepository {
	private Connection connection;
	private IncidentTypeRepository incidentTypeReposiory;
	
	public HeroRepository() {
		connection = MyConnection.getInstance();		
		
	}
	
	//Inscription d'un héro
	public int create_hero(Hero hero) {
		int id=0;
		try {
			
			PreparedStatement prepare = this.connection.prepareStatement(
                      	"INSERT INTO superhero (name, phone, address, latitude, longitude) "+
                      	"VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
                      );
			prepare.setString(1, hero.getName());	
			prepare.setString(2, hero.getPhone());
			prepare.setString(3, hero.getAddress());
			prepare.setDouble(4, hero.getLatitude());
			prepare.setDouble(5, hero.getLongitude());
			prepare.executeUpdate();
			
			ResultSet rs=prepare.getGeneratedKeys();
            if(rs.next()){
                id=rs.getInt(1);
                }
			
			System.out.println("inscription réussie");
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;	
	}

	//Hero: Renseigner les types d'incident
	public void insertIncidentType (int id_hero, int id_incident) {
		try {
			 PreparedStatement prepare = this.connection.prepareStatement(
                     "INSERT INTO incident_hero (id_hero, id_incident) "+
                     "VALUES (?, ?)"
                 );			 
		      	 prepare.setInt(1, id_hero);
	             prepare.setInt(2, id_incident);
	             prepare.executeUpdate();
	             prepare.close();
		}  catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	//Liste des héros
	public List<Hero> findAll() {
		ArrayList<Hero> heroes = new ArrayList<Hero>(); 
		Hero hero;
		ResultSet result;
		try {
			Statement stmt = this.connection.createStatement();
			result = stmt.executeQuery("SELECT * FROM superhero");
			
			while (result.next()) {
				hero = new Hero();
				hero.setId(result.getLong("id"));
				hero.setName(result.getString("name"));
				hero.setPhone(result.getString("phone"));
				hero.setAddress(result.getString("address"));
				hero.setLatitude(result.getDouble("latitude"));
				hero.setLongitude(result.getDouble("longitude"));
				
				heroes.add(hero);
			}
			stmt.close();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
		return heroes;
	}
	
//	public ArrayList<Hero> findAvailableHero(double latitude, double longotude, String incident){
//		
//		ArrayList<Hero> heroes = new ArrayList<Hero>(); 
//		Hero hero;
//		ResultSet result;
//		try {
//			Statement stmt = this.connection.createStatement();
//			result = stmt.executeQuery("SELECT * FROM superhero");
//			
//			while (result.next()) {
//				hero = new Hero();
//				hero.setId(result.getLong("id"));
//				hero.setName(result.getString("name"));
//				hero.setPhone(result.getString("phone"));
//				hero.setAddress(result.getString("address"));
//				hero.setLatitude(result.getDouble("latitude"));
//				hero.setLongitude(result.getDouble("longitude"));
//				
//				double distance = 
//				heroes.add(hero);
//			}
//			stmt.close();
//			
//		} catch (SQLException e){
//			e.printStackTrace();
//		} 
//		return null;
//		
//	}

}
