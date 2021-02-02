package chapter07.account;

class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	// static���� ����� ��ü���� �ϳ��ۿ� ������ �ȵ�
	private static int cnt;
	
	// default �����ڴ� �ؿ� ó�� parameter�� �ִ� �����ڰ� ������ �ڵ����� ���� ����
	
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
			System.out.println("�ܾ��� �����մϴ�.");
			return amount;
		}
		balance -= amount;
		return amount;
	}

	public boolean transfer(int amount, Account user) {
		if( amount > balance) {
			System.out.println("�ܾ��� �����մϴ�.");
			return false;
		}

		balance -= amount;
		user.deposit(amount);
		return true;
	}

	public  String  toString() {
		return "�ܾ��� "+balance+"�Դϴ�.";
	}
	
	

}
