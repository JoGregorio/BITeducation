package chapter08.arrayOfObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> array = new ArrayList<Dog>();
		int a=0;
		String temp1,temp2;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1. �Է�\n2. ����Ʈ ���\n3. ����");
			a=input.nextInt();
			if(a==1) {
				System.out.println("\n���� �̸���?");
				temp1 = input.next();
				System.out.println("\n���� ������?");
				temp2 = input.next();
				array.add(new Dog(temp1,temp2));				
			}
			else if(a==2) {
				for(Dog a1 : array) {
					System.out.println(a1);
				}
			}
			else if(a==3 ) {
				break;
			}
			else System.out.println("�� �Է¹ٶ��ϴ�.");
			
		}
		input.close();
	}

}
