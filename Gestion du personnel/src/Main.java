import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//declaration du driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		try {
			//connection à la DB test mysql
			conn =DriverManager.getConnection("jdbc:mysql://localhost/salle_musculation?user=root");
		} catch (SQLException ex) {
	    	System.out.println("SQLException: " + ex.getMessage());
	    	System.out.println("SQLState: " + ex.getSQLState());
	    	System.out.println("VendorError: " + ex.getErrorCode());
		}
	
		new Fenetre("menu");

	}

}
