
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val1 = "�Ź�ö";
		String val2 = "�Ź�ö";
		if(val1==val2) {
			System.out.println("val1�� val2�� ������ ����");
		}
		else System.out.println("val1�� val2�� ������ �ٸ�");
		if(val1.equals(val2)) {
			System.out.println("val1�� val2�� ���ڿ��� ����");
		}
		String val3 = new String("�Ź�ö");
		String val4 = new String("�Ź�ö");
		if(val3==val4) {
			System.out.println("val3�� val4�� ������ ����");
		}
		else System.out.println("val3�� val4�� ������ �ٸ�");
		if(val3.equals(val4)) System.out.println("val3�� val4�� ���ڿ��� ����");
	}

}
