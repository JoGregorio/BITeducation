package p64;

public class Test64page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = {'A','B','C','D'};
		System.out.println(str1);
		System.out.println(str1.length);
		
		String a = "hello";
		String b = "Hello";
		String ssn = "950202-1124444";
		
		//b���� ll�� ����
		System.out.println(b.substring(2, 4));
		//b�� �ҹ��ڷ� ��ȯ
		System.out.println(b.toLowerCase());
		//b�� �빮�ڷ� ��ȯ
		System.out.println(b.toUpperCase());
		//ssn���� ���ฦ �����Ϸ���
		if((ssn.substring(7,8)).equals("1")) System.out.println("����");
		else System.out.println("����");
		// System.out.println(ssn.charAt(7) == '1' ? "Man" : "Woman");
		//c�� ���̴�
		System.out.println(ssn.length());
		
		
		
		// String Ŭ������ ��ü�� ���� �� str1 = "A" �ߴٰ� str1 = "DBC" �ϸ� A�� ������� ���� �ƴ϶�
		// DCB�� �ּҸ� �����ٰ� ���� ���̰� A�� ����� �����Ͱ� �������� ���� ��, A�� �޸𸮿� �������
		// new ��ü�� ������ ��ü���� �޸𸮸� ���� �Ҵ���, new �Ⱦ��� str3 = "A"ó�� ���� ���ڸ� ����ϸ�
		// A�� �ּҸ� str1�� str3�� ���� �����ؼ� ����ϴ� ����(�����ͷ�)
		
		
	}

}
