package chapter07.callbyvalue;

class Account {
	private long balance =0L ;
	public void deposit(long mo){
	balance += mo;
	System.out.println("�ܾ�(BALANCE) : " +balance);
	}
	public void withdraw(long mo){
		if(mo>balance) {
			System.out.println("��� �Ұ�(�ܾ׺���)");
		}
		else {
			balance -= mo;
			System.out.println("�ܾ�(BALANCE) : " +balance);
		}

	}
	public long getBalance(){
		return balance;
	}
}
