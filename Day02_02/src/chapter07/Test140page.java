package chapter07;

	class Bank{ //Ŭ���� ���ǽ� () �� ���̱�
		private int balance;//�ܾ�
		private int account_id;//���¹�ȣ
		private int account_ps;//���º�й�ȣ
		public String Bank_name; //�����
		public void Balance_Chek(){ 
			System.out.println(balance);}
		void Print_ID(){ 
			System.out.println(account_id);}
	}

public class Test140page {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user = new Bank();
		user.Balance_Chek(); // public �޼ҵ忩�� ���� ����
		user.Print_ID(); // �ƹ��͵� ������ package ���� ���� ��Ű�� ���ο��� ���� ����
		// user.account_ps = "1"; private�̿��� ���� �Ұ���
		user.Bank_name ="��������";//�ܺ����ٰ���}
	}



}
