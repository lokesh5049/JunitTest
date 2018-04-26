package com.lk.calculationlogic;

import java.util.Scanner;

//find even or odd no program
public class FindEvenOdd {

	public static void main(String[] args) {
		int no1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER  NUMBER");
		no1 = sc.nextInt();
		if (no1< 0) {
			if (no1/2 == 0) {
				System.out.println(no1 + "   IS EVEN");
			} // IF
			else {
				System.out.println(no1 + "   IS ODD");
			} // else
		} // if
		if (no1> 0) {
			if (no1/-2 == 0) {
				System.out.println(no1 + "   IS EVEN");
			} // IF
			else {
				System.out.println(no1 + "   IS ODD");
			} // else
		} // if
	}// main

}// class
