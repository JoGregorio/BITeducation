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
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			check = scanner.nextInt();
			switch(check) {
			case 1:{
				System.out.print("예금액 : ");
				temp = scanner.nextInt();
				balance = balance + temp;
				break;
			}
			case 2:{
				System.out.print("출금액 : ");
				temp = scanner.nextInt();
				if(temp>balance) System.out.println("오류, 잔고부족");
				else {
					balance = balance - temp;
				}
				break;
			}
			case 3:{
				System.out.println("잔고 : "+balance);
				break;
			}
			case 4:{
				System.out.println("프로그램 종료");
				run=false;
				break;
			}
			}
		}
		scanner.close();
	}

}
