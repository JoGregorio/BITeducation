package chapter08.calc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New_Calc calc = new New_Calc();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a= in.nextInt();
		System.out.println("Enter num2: ");
		int b = in.nextInt();
		System.out.println("Enter operator: ");
		char c = in.next().charAt(0);
		System.out.println(calc.calculate(a, b, c));
		in.close();

	}

}
