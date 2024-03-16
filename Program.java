package Demo2;

import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	int a = 42;
	double b = a;
	float c = a;
	boolean d = (a != 0);
	String str = String.valueOf(a);
	
	
	System.out.println(b); // Widening
	System.out.println(c); // Widening
	System.out.println(d); // Widening
	System.out.println(str); // Widening
}
}
