package chapter04;

import java.util.Scanner;

public class BiggestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,x;
		Scanner input = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���.");
			a=input.nextInt();
			System.out.println("���ڸ� �Է��ϼ���.");
			b=input.nextInt();
			System.out.println("���ڸ� �Է��ϼ���.");
			c=input.nextInt();
			
			if(a>b) x=a;
			else x=b;
			if(c>x) x=c;
			System.out.printf("���� ū ���� %d�Դϴ�.",x);
			input.close();
		
	}

}
