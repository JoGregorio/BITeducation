package chapter07.getset;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
		Scanner sc = new Scanner(System.in);
		Now now = new Now();
		System.out.println("����ð�:" + now.getTime());
		System.out.println("�����̸�:" + now.getName());
		System.out.printf("������ �̸��� �Է��Ͻʽÿ�: ");
		String str = sc.nextLine();
		now.setName(str);
		String time1 = dayTime.format(new Date());
		now.setTime(time1);
		System.out.println("����ð�:" + now.getTime());
		System.out.println("�����̸�:" + now.getName());
		sc.close();
	}

}
