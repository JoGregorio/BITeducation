package chapter07.watch;

public class Watchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch watch1 = new Watch("ARMANI", 1, 30, 50);
		watch1.ToString(); 
		// ARMANI, 1, 30, 50
		System.out.println("�ð��ǰ�����: "+ Watch.getWatch_Number() + "��");
		
		//**********************************************************************
		
		// static method�� getWatch�� ȣ���ϱ� ���ؼ��� Watch 'Ŭ����'�� ���� ġ�� �޼ҵ带 ȣ��
	}

}
