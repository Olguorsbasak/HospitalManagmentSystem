import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	static String url ="jdbc:postgresql://localhost:5432/HospitalManagment";
	
	 static Connection conn=null;
	
	static void connect() {
		try {
			conn=DriverManager.getConnection(url,"postgres","327513");
			System.out.println("Connection Succesful");
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}
	

}
