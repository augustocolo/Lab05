package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	// check user e password
	static private final String jdbcUrl = "jdbc:mysql://localhost:3306/dizionario?user=root&password=password";
	private Connection connection;
	
	public ConnectDB() {
		try {
			this.connection = DriverManager.getConnection(jdbcUrl);
		} catch (SQLException e) {
	
			e.printStackTrace();
			throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
		}
	}

	public Connection getConnection() {
		return this.connection;
	}

}
