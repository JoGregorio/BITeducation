package chapter04;

public class Test81page {

	// main�� static method��, static method�� static�� ȣ�� �� �� �ִ�.
	// static�� ���� Ŭ������ ��ü�� ������ �ʾƵ� Method Area �޸𸮿� ����Ǿ��ִ�.
	// static ������ �θ� �� �ֱ⿡ �ؿ� f�Լ� ���� �κп� static ���� ����
	// ���α׷� ���ۿ��� ������� �޸𸮿� ����Ǿ�����
	
	public static void main( String args[] ) {
		f(6);
	}
	static void f(int i) {
		if (i%2 == 0) System.out.println("¦��");
		if (i%3 == 0) {
			System.out.println("3�� ���");
			System.out.println("i = " + i);
		}
		if (i%5 == 0) System.out.println("5�� ���");
		else if (i % 5 == 1) System.out.println("5�� ��� + 1");
		else System.out.println("5�� ��� + 2 Ȥ�� 3 Ȥ�� 4");
	}


}