package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.Incident;

public class IncidentTypeRepository {
	private Connection connection;
	
	public IncidentTypeRepository() {
		connection = MyConnection.getInstance();
	}
	
	//Récupérer la liste des incidents
	 public ArrayList<Incident> findAll() {
			ArrayList<Incident> incidents = new ArrayList<Incident>(); 
			Incident incident;
			ResultSet result;
			try {
				Statement stmt = this.connection.createStatement();
				result = stmt.executeQuery("SELECT * FROM type_incident");
				while (result.next()) {
					incident = new Incident();
					incident.setId(result.getLong("id"));
					incident.setName_incident(result.getString("name_incident"));
					incidents.add(incident);
				}
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return incidents;
		}
	 
}
