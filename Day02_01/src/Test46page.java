
public class Test46page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b;
		b = a; // 업캐스팅
		// a = b; // 다운캐스팅
		a = (int)b; // 다운캐스팅
		System.out.println(a);
		b = 10 / 3; // 정수하고 정수 계산하면 정수로 나옴 3인데 b는 더블 타입이라 3.0
		System.out.println(b);
		b = (double)10 / 3; // 다운캐스팅
		System.out.println(b);
		b =(int)10.2 + (int)3.3; // 다운캐스팅
		System.out.println(b);
		b = (int)10.2 + 3.3; // 다운캐스팅
		System.out.println(b);
	}

}
