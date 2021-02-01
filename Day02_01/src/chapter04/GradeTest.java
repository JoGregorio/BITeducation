package chapter04;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("점수 입력하시오.");
		grade = input.nextInt();
		switch(grade/10){
		case 9: case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			
		}
		input.close();
	}

}
