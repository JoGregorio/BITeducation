package chapter04;

public class Test81page {

	// main은 static method임, static method는 static만 호출 할 수 있다.
	// static이 붙은 클래스는 객체를 만들지 않아도 Method Area 메모리에 저장되어있다.
	// static 끼리만 부를 수 있기에 밑에 f함수 정의 부분에 static 빼면 오류
	// 프로그램 시작에서 종료까지 메모리에 저장되어있음
	
	public static void main( String args[] ) {
		f(6);
	}
	static void f(int i) {
		if (i%2 == 0) System.out.println("짝수");
		if (i%3 == 0) {
			System.out.println("3의 배수");
			System.out.println("i = " + i);
		}
		if (i%5 == 0) System.out.println("5의 배수");
		else if (i % 5 == 1) System.out.println("5의 배수 + 1");
		else System.out.println("5의 배수 + 2 혹은 3 혹은 4");
	}


}
