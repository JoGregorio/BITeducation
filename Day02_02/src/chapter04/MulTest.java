package chapter04;

import java.util.Scanner;

public class MulTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=1;
		Scanner input = new Scanner(System.in);
		System.out.println("����ϰ� ���� ������ ���� �Է��Ͻÿ�.");
		i = input.nextInt();
		do {
			System.out.printf("%d * %d = %d\n",i,j,i*j);
			j++;
		}while(j<=9);
		input.close();
	}

}
