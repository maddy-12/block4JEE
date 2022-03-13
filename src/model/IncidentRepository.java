package model;

import java.sql.Connection;

public class IncidentRepository {
	
	private Connection connection;
	
	public IncidentRepository() {
		// TODO Auto-generated constructor stub
		connection = MyConnection.getInstance();
	}

}
