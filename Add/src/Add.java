import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,sum;
		System.out.println("Input num1 : ");
		x = input.nextInt();
		System.out.println("Input num2 : ");
		y = input.nextInt();
		sum= x/y;
		System.out.println(sum);
		System.out.println("result = "+ x/y);
		input.close(); // �ڹٿ����� �ڵ����� ������ �ݷ��Ͱ� �־ ��� ���ƴ� ��, �׷��� �ٸ� ���α׷��ֿ����� �ʿ��� ��쵵 ����
	}
}
