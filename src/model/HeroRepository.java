package model;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Hero;

public class HeroRepository {
	private Connection connection;
	public HeroRepository() {
		connection = MyConnection.getInstance();
	}
	
	public void create_hero(Hero hero) {
		try {
			
			PreparedStatement prepare = this.connection.prepareStatement(
                      	"INSERT INTO superhero (name, phone, address, latitude, longitude) "+
                      	"VALUES (?, ?, ?, ?, ?)"
                      );
			prepare.setString(1, hero.getName());	
			prepare.setString(2, hero.getPhone());
			prepare.setString(3, hero.getAddress());
			prepare.setDouble(4, hero.getLatitude());
			prepare.setDouble(5, hero.getLongitude());
			prepare.executeUpdate();
			
			System.out.println("inscription réussie");
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Hero> findAll() {
		ArrayList<Hero> heroes = new ArrayList<Hero>(); 
		Hero hero;
		ResultSet result;
		try {
			Statement stmt = this.connection.createStatement();
			result = stmt.executeQuery("SELECT * FROM superhero");
			
			while (result.next()) {
				hero = new Hero(null, null, null, 0, 0);
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

}
