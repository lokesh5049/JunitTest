package com.lk.calculationlogic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoveCalculator{
	
	static String name;
	static String password;
	static String email;
	String crushName1;
	String crushName2;
	String crushName3;
	 int case1;
	 int case2;
	 int case3;
	 int m;
	 public static void crush(){
		 String title=null;
		int rs=0;
		 PreparedStatement ps=null;
		 title="*-*-*-*-*-*-*-*-WELLCOME TO LOVE CALCULATOR*-*-*-*-*-*-*-*-";
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println(title);
		 System.out.println();
		 
		 System.out.println("ENTER YOUR EMAIL");
		 email=sc.nextLine();
		 System.out.println("ENTER YOUR PASSWORD ");
		 password=sc.nextLine();
		 System.out.println("ENTER YOUR NAME ");
		 name=sc.nextLine();
		 if(email!=null&&password!=null){
			 try {
				ps.setString(1,email);
				ps.setString(2,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs=CreateJdbcConnection.getResultInt("select count(*) from credential where username=? and password=?");
			 
		 if(rs==1){
		 System.out.println("\f");
		 System.out.println(title);
		 System.out.println();
		 System.out.println();
		 System.out.println("THANK YOU FOR CHOOSING US");
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 
		 }//inner if
		 }
		 
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
}
