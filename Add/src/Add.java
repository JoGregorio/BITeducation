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
		input.close(); // 자바에서는 자동으로 가비지 콜렉터가 있어서 없어도 돌아는 감, 그러나 다른 프로그래밍에서는 필요한 경우도 있음
	}
}
