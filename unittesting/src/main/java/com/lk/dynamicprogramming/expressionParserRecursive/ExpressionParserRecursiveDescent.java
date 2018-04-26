package com.lk.dynamicprogramming.expressionParserRecursive;

public class ExpressionParserRecursiveDescent {

	String s;
	int pos;
	char token;
	double tokval;
	
	static boolean isDigitOrDot(char x){
		
		
		return Character.isDigit(x)||x=='.';
	}
	
	int next(){
		
		while(true){
			if(pos==s.length())
			    return token=255;
			char c=s.charAt(pos++);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
