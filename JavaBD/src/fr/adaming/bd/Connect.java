/**
 * 
 */
package fr.adaming.bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author INTI-0332
 *
 */
public class Connect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");
			
			String url = "jdbc:postgresql://localhost:5432/Ecole";
			String user = "postgres";
			String passwd = "intijee";
			
			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion effective !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
