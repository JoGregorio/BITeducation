import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		int check,temp;
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			System.out.println("����> ");
			check = scanner.nextInt();
			switch(check) {
			case 1:{
				System.out.print("���ݾ� : ");
				temp = scanner.nextInt();
				balance = balance + temp;
				break;
			}
			case 2:{
				System.out.print("��ݾ� : ");
				temp = scanner.nextInt();
				if(temp>balance) System.out.println("����, �ܰ����");
				else {
					balance = balance - temp;
				}
				break;
			}
			case 3:{
				System.out.println("�ܰ� : "+balance);
				break;
			}
			case 4:{
				System.out.println("���α׷� ����");
				run=false;
				break;
			}
			}
		}
		scanner.close();
	}

}
