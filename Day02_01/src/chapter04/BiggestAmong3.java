package chapter04;

import java.util.Scanner;

public class BiggestAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,x;
		Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			a=input.nextInt();
			System.out.println("숫자를 입력하세요.");
			b=input.nextInt();
			System.out.println("숫자를 입력하세요.");
			c=input.nextInt();
			
			if(a>b) x=a;
			else x=b;
			if(c>x) x=c;
			System.out.printf("가장 큰 수는 %d입니다.",x);
			input.close();
		
	}

}
