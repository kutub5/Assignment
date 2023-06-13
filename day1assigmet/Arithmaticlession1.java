package day1assigmet;

import java.util.Scanner;

public class Arithmaticlession1 {
	public static int addition(int a,int b) {
	int multiply;
	multiply=a*b;
	return multiply;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b;
       System.out.println("inter two numbers");
       Scanner obj = new Scanner(System.in);
       a=obj.nextInt();
       b=obj.nextInt();
       System.out.println(addition(a,b)); 
       System.out.println("Subtraction");
       System.out.println("Multuplication");
       System.out.println("Division");
      
	}

}
