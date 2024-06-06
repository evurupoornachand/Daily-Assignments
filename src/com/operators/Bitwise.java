package com.operators;

public class Bitwise {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 5;
		System.out.println((c < a) & (a > b));
		System.out.println((c < a) | (a > b));
		System.out.println((c < a) ^ (a > b));
		System.out.println(b<<2);
		System.out.println(a>>3);
	}

}
