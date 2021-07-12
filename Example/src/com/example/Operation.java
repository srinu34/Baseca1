package com.example;

public class Operation {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int k=0;
		 k = add(a,b);
		int y=a+k;
		
		System.out.println(y);
	}

	private static int add(int a,int b) {
		int c = a + b;
		return c;
	}

}
