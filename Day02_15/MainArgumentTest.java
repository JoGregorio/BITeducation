import java.util.Scanner;

public class MainArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("�ý��� ����");
			System.exit(0);
		}
		String name = args[0];
		String number = args[1];
		System.out.println("�̸� : "+name+" ��ȭ��ȣ : "+number);
		}
}
