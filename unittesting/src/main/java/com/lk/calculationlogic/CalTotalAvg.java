package com.lk.calculationlogic;

import java.util.Scanner;



public class CalTotalAvg {

	public static void main(String[] args) {
		String name=null;
		int rollNo=0;
		int m1=0;
		int m2=0;
		int m3=0;
		int total=0;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STUDENT ROLLNO");
		rollNo=sc.nextInt();
		System.out.println("ENTER STUDENT NAME");
		name=sc.next();
		System.out.println("ENTER PHYSICS SUBJECT MARKS");
		m1=sc.nextInt();
		System.out.println("ENTER MATHS SUBJECT MARKS");
		m2=sc.nextInt();
		System.out.println("ENTER CHEMISTRY SUBJECT MARKS");
		m3=sc.nextInt();
		//cal total
		total=m1+m2+m3;
		if(total!=0){
		//cal avg
		avg=total/3;
		}
		System.out.println("VIDHYAPETH H.S.SCHOOL,RATLAM(M.P.)");
		System.out.println("       pincode-400252            ");
		System.out.println("**********************************");
		System.out.println("STUDENT NAME          ROLL NO.");
		System.out.println("------------------------------");
		System.out.println(name+"            "+rollNo);
		System.out.println();
		System.out.println("PHYSICS     MATHS     CHEMISTRY");
		System.out.println("-------------------------------");
		System.out.println(m1+"     "+m2+"     "+m3);
		System.out.println();
		System.out.println("TOTAL MARKS          AVERAGE MARKS");
		System.out.println(total+"          "+avg);
		System.out.println();
		System.out.println("************************************");
		System.out.println("THANK YOU");
		System.out.println("*************************************");
	}

}
