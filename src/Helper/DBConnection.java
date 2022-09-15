package Helper;
import java.sql.*;


public class DBConnection {
Connection c=null;

public DBConnection() {}
	
	public Connection connDb() {
		try {
			this.c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/HospitalManagment?user=postgres&password=327513");
			return c;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return c;
	}
	}



	

	

	

	
	


