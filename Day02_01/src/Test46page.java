
public class Test46page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b;
		b = a; // ��ĳ����
		// a = b; // �ٿ�ĳ����
		a = (int)b; // �ٿ�ĳ����
		System.out.println(a);
		b = 10 / 3; // �����ϰ� ���� ����ϸ� ������ ���� 3�ε� b�� ���� Ÿ���̶� 3.0
		System.out.println(b);
		b = (double)10 / 3; // �ٿ�ĳ����
		System.out.println(b);
		b =(int)10.2 + (int)3.3; // �ٿ�ĳ����
		System.out.println(b);
		b = (int)10.2 + 3.3; // �ٿ�ĳ����
		System.out.println(b);
	}

}
