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
		System.out.println(this.bookName + "가 반납되었습니다.");
		System.out.println("대출인 : "+id);
		System.out.println("대출일 : "+date);
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println(this.bookName + "가 대출되었습니다.");
		System.out.println("대출인 : "+id);
		System.out.println("대출일 : "+date);
	}

}
