package Demo2;

import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	int i = 20;
	double d = 20.5;
	float f = 15.2f;
	
	double sum = i + d;
	double diff = d - i;
	double mult = i * f;
	double div = d / f;
	
	
	 System.out.println("Int value: " + i);
     System.out.println("Double value: " + d);
     System.out.println("Float value: " + f);
     System.out.println("Sum (int + double): " + sum);
     System.out.println("Difference (double - int): " + diff);
     System.out.println("Product (int * float): " + mult);
     System.out.println("Quotient (double / float): " + div);
}
}
