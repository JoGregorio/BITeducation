package chapter04;

import java.util.Scanner;

public class Test74page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		System.out.println("시간을 입력하세요.");
		hours = input.nextInt();
		if(hours>0) {
			pay = hours * 9000;
			System.out.printf("임금은 %d입니다.\n",pay);

		}
		else {
			System.out.println("시간이 잘못 입력되었습니다.");
		}
		input.close();
	}

}
