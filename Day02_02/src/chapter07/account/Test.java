package chapter07.account;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("12345", "Ã¶¼ö", 10000);
		System.out.println("account : "+account);
		
		Account adam = new Account("987", "adam", 20000);
		System.out.println("adam : "+adam);

		account.transfer(4000, adam);
		System.out.println("account : "+account);
		System.out.println("adam : "+adam);

		

	}

}
