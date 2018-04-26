package com.lk.calculationlogic;

public class TestCase {

	public static void main(String[] args) {
		int[] a={1,3,2,7,5};
		TestCase ts=new TestCase();
		ts.sort(a,0,a.length-1);

	}
	void sort(int array[],int begain,int end){
		if(begain<end){
		int m=(begain+end)/2;
		System.out.println(m);
		sort(array,begain,m);
		sort(array,m+1,end);
		merge(array,begain,m,end);
	}
	}
    void merge(int[] array, int begain, int m, int end) {
		
	System.out.println("begain::::::::"+begain);
	System.out.println("m::::::::"+m);
	System.out.println("end::::::::"+end);
	}

}
