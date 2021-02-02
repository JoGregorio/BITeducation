package chapter07.watch;

class Watch {
	private String brand; 
	private int hour; 
	private int minute; 
	private int second; 
	private static int watch_number = 0;//��������static final 
	int MAX_NUMBER = 5;//�������
	//����Ʈ������
	public Watch(){}

	//�Ű��������ִ»�����
	public Watch(String brand, int hour, int minute, int second){
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		watch_number++;
	}//�Ϲݸ޼ҵ�
	public void ToString(){
		System.out.println(brand +" "+ hour +" "+ minute +" "+ second);
	}//get�޼ҵ�
	public static int getWatch_Number(){
		return watch_number;
	}
}
