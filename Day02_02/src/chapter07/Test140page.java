package chapter07;

	class Bank{ //클래서 정의시 () 안 붙이기
		private int balance;//잔액
		private int account_id;//계좌번호
		private int account_ps;//게좌비밀번호
		public String Bank_name; //은행명
		public void Balance_Chek(){ 
			System.out.println(balance);}
		void Print_ID(){ 
			System.out.println(account_id);}
	}

public class Test140page {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user = new Bank();
		user.Balance_Chek(); // public 메소드여서 접근 가능
		user.Print_ID(); // 아무것도 없으면 package 여서 같은 패키지 내부에서 접근 가능
		// user.account_ps = "1"; private이여서 접근 불가능
		user.Bank_name ="신한은행";//외부접근가능}
	}



}
