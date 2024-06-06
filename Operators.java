Arithmetic Operators

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
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Assignment Operators

  package com.operators;

public class Assignment {
	public static void main(String[] args) {
		int a = 20;
		System.out.println("a = :" + (a));
		 System.out.println("a += 3: " + (a += 3));
	     System.out.println("a -= 2: " + (a -= 2));
	     System.out.println("a *= 4: " + (a *= 4));
	     System.out.println("a /= 3: " + (a /= 3));
	     System.out.println("a %= 2: " + (a %= 2));
	}

}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Comparision Operators

  package com.operators;

public class Comparison {
	public static void main(String[] args) {
		int a = 20;
        int b = 5;
        int c = 10;

        System.out.println("a == c: " + (a == b));
        System.out.println("a != c: " + (a != b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a <= b: " + (a <= c));
        System.out.println("a >= b: " + (a >= c));
	}

}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Boolean Operators

  package com.operators;

public class Boolean {
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int p = 5;
		System.out.println((p < a) & (a > b));
		System.out.println((p < a) | (a > b));
		System.out.println((p < a) ^ (a > b));
	}

}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Logical Operators

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
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Short-Circuit Operators

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
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Ternary Operators

  package com.operators;

public class Ternary {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int min = (a < b) ? a : b;
		System.out.println(min);
	}

}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
