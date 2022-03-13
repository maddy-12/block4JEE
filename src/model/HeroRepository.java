package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Hero;

public class HeroRepository {
	private Connection connection;
	public HeroRepository() {
		connection = MyConnection.getInstance();
	}
	
	public void create_hero(Hero hero, Long id_incident ) {
		try {
			
			PreparedStatement prepare = this.connection.prepareStatement(
                      	"INSERT INTO superhero (name,type_incident,phone) "+
                      	"VALUES (?, ?, ?)"
                      );
			prepare.setString(1, hero.getName());
			prepare.setString(2, hero.getPhone());
			prepare.setLong(3, id_incident);
			prepare.executeUpdate();
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
