package database;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
		
		try {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="system";
			String pass="Virat555";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection(url,username,pass);
			System.out.println("Database connected sucessfully..");
			Statement stmt=conn.createStatement();
			String sql="select * From student";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
