package chapter07.diceclass;

public class Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		dice1.setResult(dice1.roll());
		dice2.setResult(dice2.roll());

		if(dice1.getResult()==dice2.getResult()) {
			System.out.println("���� ���� ���� ���Խ��ϴ�.");
			System.out.println("dice1�� ��"+ dice1.getResult());
			System.out.println("dice2�� ��"+dice2.getResult());
		}
		else {
			System.out.println("���� �ٸ� ���� ���Խ��ϴ�.");
			System.out.println("dice1�� ��"+ dice1.getResult());
			System.out.println("dice2�� ��"+dice2.getResult());
		}


	}

}
