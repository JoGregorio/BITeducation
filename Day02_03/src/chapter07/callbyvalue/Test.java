package chapter07.callbyvalue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		long balance;
		Scanner c = new Scanner(System.in);
		Account a = new Account();
		System.out.println("원하는거래선택" );
		System.out.println("[1]입금(DEPOSIT)" );
		System.out.println("[2]출금(WITHDRAW)" );
		System.out.println("[3]조회(BALANCE CHECK)" );
		System.out.println("[4]종료(QUIT)" );
		input = c.nextInt();

		for(;;) {
			if(input == 1)
			{
				System.out.print("금액입력: " );
				balance = c.nextLong();
				a.deposit(balance);
			}
			else if( input ==2)
			{		
				System.out.print("금액입력: " );
				balance = c.nextLong();
				a.withdraw(balance);
			}
			else if( input == 3)
			{
				System.out.println("현재잔액: " + a.getBalance() );
				
			}
			else if( input == 4)
			{
				System.out.println("시스템 종료." );
				break;
			}
			else
			{
				System.out.println("잘못선택하셨습니다." );
			}
			System.out.println("원하는거래선택" );
			System.out.println("[1]입금(DEPOSIT)" );
			System.out.println("[2]출금(WITHDRAW)" );
			System.out.println("[3]조회(BALANCE CHECK)" );
			System.out.println("[4]종료(QUIT)" );
			input = c.nextInt();
		}
		c.close();
	}

}
