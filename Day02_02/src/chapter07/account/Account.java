package chapter07.account;

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	// static으로 만들면 전체에서 하나밖에 생성이 안됨
	private static int cnt;
	
	// default 생성자는 밑에 처럼 parameter가 있는 생성자가 있으면 자동생성 하지 않음
	
	public Account(String no, String name, int bal) {
		this.accountNo = no;
		this.ownerName = name;
		this.balance = bal;
		cnt++;
	}

	public void deposit(int amount) {
		balance += amount;	
	}

	public int withdraw(int amount) {
		if( amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return amount;
		}
		balance -= amount;
		return amount;
	}

	public boolean transfer(int amount, Account user) {
		if( amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return false;
		}

		balance -= amount;
		user.deposit(amount);
		return true;
	}

	public  String  toString() {
		return "잔액은 "+balance+"입니다.";
	}
	
	

}
