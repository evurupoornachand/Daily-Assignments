package com.operators;

public class ShortCircuit {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println((b < c) && (a++ > c));
        System.out.println(a);
        System.out.println((b < c) || (a++ > c));
        System.out.println(a);
	}

}
