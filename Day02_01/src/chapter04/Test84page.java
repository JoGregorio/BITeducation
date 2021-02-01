package chapter04;

import java.util.Scanner;

public class Test84page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		
		int days =0;
		System.out.print("Input Month");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		switch(month)
		{
		case 1 :case 3: case 5:case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4 :case 6: case 9: case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;
		default:
			System.out.println("Month Input Error");
			break;
		}
		System.out.println(month+"월의날짜수는"+days+"일입니다.");
		scan.close();
	}

}
