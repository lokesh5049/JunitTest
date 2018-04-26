package com.lk.calculationlogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CreateJdbcConnection {

	static{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static int getResultInt(String quary){
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","lokesh");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			ps=con.prepareStatement(quary);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			result=ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		finally{
			
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return 0;
		
		
	}//resultInt
}//class
