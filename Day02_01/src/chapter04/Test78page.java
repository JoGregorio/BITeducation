package chapter04;

import java.util.Scanner;

public class Test78page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		grade = input.nextInt();
		if(grade>=90)
			System.out.println("A");
		else if(grade>=80)
			System.out.println("B");
		else if(grade>=70)
			System.out.println("C");
		else if(grade>=60)
			System.out.println("D");
		else
			System.out.println("F");
		input.close();
	}

}