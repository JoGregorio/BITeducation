package chapter08.custControl;
import java.util.ArrayList;
import java.util.Scanner;
public class Control {
	Control(){
		int test=0;		
		String id,name,grade;
		Scanner input = new Scanner(System.in);
		ArrayList<VIPCustomer> array1 = new ArrayList<VIPCustomer>();
		ArrayList<GoldCustomer> array2 = new ArrayList<GoldCustomer>();
		while(true) {
			System.out.println("1. ���Է�\n2. �����");
			test=input.nextInt();
			if(test==1) {
				System.out.println("���̵� �Է��Ͻÿ�.");
				id=input.next();
				System.out.println("�̸��� �Է��Ͻÿ�.");
				name=input.next();
				System.out.println("����� �Է��Ͻÿ�. ex) VIP, Gold");
				grade = input.next();
				if(grade.equals("VIP")) {
					array1.add(new VIPCustomer(id,name));
					continue;				}
				else if(grade.equals("Gold")) {	
					array2.add(new GoldCustomer(id,name));
					continue;				}
				else {
					System.out.println("�� �Է��Ͻÿ�.");
					continue;				
				}			
			}
			else if(test==2) {for(VIPCustomer a : array1) {
				System.out.println(array1);				
			}
			for(GoldCustomer b : array2) {
				System.out.println(array2);				
			}
			continue;
			}
			else 
				System.out.println("�������� ���� ����, �ý��� ����");
			break;
		}	input.close();
	}  
}
