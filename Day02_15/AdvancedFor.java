import java.util.Scanner;

public class AdvancedFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		for(char b:a.toCharArray()) {
			System.out.print(b+"*");
		}
	}
}