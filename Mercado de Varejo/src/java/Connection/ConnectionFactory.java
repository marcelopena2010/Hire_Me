package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private final static String DRIVER = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection(){
		try {
			Class.forName(DRIVER);
			String url;
                        url = String.format("jdbc:mysql://localhost:3306/varejo");
			String usuario = "root";
			String senha = "root";

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException c) {
			c.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
