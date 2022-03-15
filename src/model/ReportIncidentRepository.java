package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.ReportIncident;

public class ReportIncidentRepository {
	private Connection connection;
	
	public ReportIncidentRepository() {
		connection = MyConnection.getInstance();
	}
	//Déclarer un incident
	public void create_incident(ReportIncident reportIncident) {
		
		try {
			PreparedStatement prepare = this.connection.prepareStatement(
                  	"INSERT INTO report_incident (address, latitude, longitude, id_incident) "+
                  	"VALUES (?, ?, ?, ?)"
                  );
			prepare.setString(1, reportIncident.getAddress());	
			prepare.setDouble(2, reportIncident.getLatitude());
			prepare.setDouble(3, reportIncident.getLongitude());
			prepare.setInt(4, reportIncident.getType_incident());
			prepare.executeUpdate();
			System.out.println("déclaration réussie");
			prepare.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	
}
