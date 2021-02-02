package chapter07.watch;

class Watch {
	private String brand; 
	private int hour; 
	private int minute; 
	private int second; 
	private static int watch_number = 0;//정적변수static final 
	int MAX_NUMBER = 5;//정적상수
	//디폴트생성자
	public Watch(){}

	//매개변수가있는생성자
	public Watch(String brand, int hour, int minute, int second){
		this.brand = brand;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		watch_number++;
	}//일반메소드
	public void ToString(){
		System.out.println(brand +" "+ hour +" "+ minute +" "+ second);
	}//get메소드
	public static int getWatch_Number(){
		return watch_number;
	}
}
