package chapter04;

import java.util.Scanner;

public class Test74page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���.");
		hours = input.nextInt();
		if(hours>0) {
			pay = hours * 9000;
			System.out.printf("�ӱ��� %d�Դϴ�.\n",pay);

		}
		else {
			System.out.println("�ð��� �߸� �ԷµǾ����ϴ�.");
		}
		input.close();
	}

}
