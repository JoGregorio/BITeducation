package chapter08.multiImplements;

public class VideoShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;VideoShop vs = new VideoShop(); 
		//�������Ի���
		System.out.println("�����Ѻ���������" + vs.getCount());
		//1. 3���Ǻ����ݳ�
		vs.enQueue("��Ʈ����1"); //�����ݳ�
		vs.enQueue("��Ʈ����2"); //�����ݳ�
		vs.enQueue("��Ʈ����3"); //�����ݳ�
		System.out.println("�����Ѻ���������" + vs.getCount());
		
		//2. 3���Ǻ���������
		temp = vs.deQueue(); 
		System.out.println(temp + " ����");
		temp = vs.deQueue(); 
		System.out.println(temp + " ����");
		temp = vs.deQueue(); 
		System.out.println(temp + " ����");
		System.out.println("�����Ѻ���������" + vs.getCount());
	}

}
