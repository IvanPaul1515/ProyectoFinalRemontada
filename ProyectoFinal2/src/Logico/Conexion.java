package Logico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	
    public static void debrequest(String str) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;encrypt=false;databaseName=Sistemaarrendamiento;user=sa;password=123456";
        try {
        	Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str.intern());
            while (rs.next()) {
            	System.out.println(rs);
            }
   
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
}
