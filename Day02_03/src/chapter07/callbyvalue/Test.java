package chapter07.callbyvalue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		long balance;
		Scanner c = new Scanner(System.in);
		Account a = new Account();
		System.out.println("���ϴ°ŷ�����" );
		System.out.println("[1]�Ա�(DEPOSIT)" );
		System.out.println("[2]���(WITHDRAW)" );
		System.out.println("[3]��ȸ(BALANCE CHECK)" );
		System.out.println("[4]����(QUIT)" );
		input = c.nextInt();

		for(;;) {
			if(input == 1)
			{
				System.out.print("�ݾ��Է�: " );
				balance = c.nextLong();
				a.deposit(balance);
			}
			else if( input ==2)
			{		
				System.out.print("�ݾ��Է�: " );
				balance = c.nextLong();
				a.withdraw(balance);
			}
			else if( input == 3)
			{
				System.out.println("�����ܾ�: " + a.getBalance() );
				
			}
			else if( input == 4)
			{
				System.out.println("�ý��� ����." );
				break;
			}
			else
			{
				System.out.println("�߸������ϼ̽��ϴ�." );
			}
			System.out.println("���ϴ°ŷ�����" );
			System.out.println("[1]�Ա�(DEPOSIT)" );
			System.out.println("[2]���(WITHDRAW)" );
			System.out.println("[3]��ȸ(BALANCE CHECK)" );
			System.out.println("[4]����(QUIT)" );
			input = c.nextInt();
		}
		c.close();
	}

}
