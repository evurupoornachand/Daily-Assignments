package com.operators;

public class Arithmetic {
	public static void main(String[] args) {
		int a = 20;
        int b = 10;
      
        System.out.println("value of a + b : " + (a + b));
        System.out.println("value of a - b : " + (a - b));
        System.out.println("value of a * b : " + (a * b));
        System.out.println("value of a / b : " + (a / b));
        System.out.println("value of a % b : " + (a % b));
        
        System.out.println("Postincrement  : " + (a++));
        System.out.println("Postdecrement  : " + (b--));
        System.out.println("Preincrement   : " + (++a));
        System.out.println("Predecrement   : " + (--b));
	   
	}

}
