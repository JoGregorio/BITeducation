package chapter07.callbyvalue;

class Account {
	private long balance =0L ;
	public void deposit(long mo){
	balance += mo;
	System.out.println("잔액(BALANCE) : " +balance);
	}
	public void withdraw(long mo){
		if(mo>balance) {
			System.out.println("출금 불가(잔액부족)");
		}
		else {
			balance -= mo;
			System.out.println("잔액(BALANCE) : " +balance);
		}

	}
	public long getBalance(){
		return balance;
	}
}
