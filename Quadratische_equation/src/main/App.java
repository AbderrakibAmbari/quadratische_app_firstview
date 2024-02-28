package main;

import java.util.Scanner;

public class App {
public static void main (String args[]) {
		double solution1;
		double solution2;
		double solution3;
		Scanner sn= new Scanner(System.in);
		System.out.println("here is your equation looks like : ");
		System.out.println("a(x^2)+2bx+c");
		System.out.println("======================================");
		System.out.println("======================================");
		System.out.println("give me a");
		String first=sn.nextLine();
		double a=Double.parseDouble(first);
		
		System.out.println("give me b");
		String second=sn.nextLine();
		double b=Double.parseDouble(second);
		
		System.out.println("give me c");
		String third=sn.nextLine();
		double c=Double.parseDouble(third);
		
		double delta=(b*b)-(4*a*c);
		if(delta<0) {
			System.out.println("there is no solution in this equation in the real numeric R");
			System.exit(0);
		}
		else if(delta==0) {
			solution1=-b/(2*a);
			System.out.println("the solution is:"+ solution1);
			System.exit(0);
		}
		else {
			solution2=(-b-Math.sqrt(delta))/2*a;
			solution3=(-b+Math.sqrt(delta))/2*a;
			System.out.println("your Solution are :"+solution2+ "   "+solution3);
			System.exit(0);
		}
}
}
