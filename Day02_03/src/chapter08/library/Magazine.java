package chapter08.library;

public class Magazine extends Book implements Lendable {
	
	public Magazine(String a,String b, String c) {
		this.bookName = a;
		this.date = b;
		this.id = c;
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println(this.bookName + "�� �ݳ��Ǿ����ϴ�.");
		System.out.println("������ : "+id);
		System.out.println("������ : "+date);
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println(this.bookName + "�� ����Ǿ����ϴ�.");
		System.out.println("������ : "+id);
		System.out.println("������ : "+date);
	}

}
