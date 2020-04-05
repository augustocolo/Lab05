package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AnagrammiDAO {
	
	private ConnectDB connectDB = new ConnectDB();
	
	public boolean isCorrect(String word) {
		final String sql = "SELECT count(*) FROM parola WHERE nome = ?";
		
		try {
			Connection conn = connectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, word);

			ResultSet rs = st.executeQuery();
			
			rs.next();
			
			if (rs.getInt("count(*)") == 1) {
				return true;
			}
			
			return false;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}
}
