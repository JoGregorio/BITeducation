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
			System.out.println("1. 고객입력\n2. 고객목록");
			test=input.nextInt();
			if(test==1) {
				System.out.println("아이디를 입력하시오.");
				id=input.next();
				System.out.println("이름을 입력하시오.");
				name=input.next();
				System.out.println("등급을 입력하시오. ex) VIP, Gold");
				grade = input.next();
				if(grade.equals("VIP")) {
					array1.add(new VIPCustomer(id,name));
					continue;				}
				else if(grade.equals("Gold")) {	
					array2.add(new GoldCustomer(id,name));
					continue;				}
				else {
					System.out.println("재 입력하시오.");
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
				System.out.println("비정상적 접근 감지, 시스템 종료");
			break;
		}	input.close();
	}  
}
