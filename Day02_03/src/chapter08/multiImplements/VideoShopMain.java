package chapter08.multiImplements;

public class VideoShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;VideoShop vs = new VideoShop(); 
		//비디오가게생성
		System.out.println("보유한비디오갯수는" + vs.getCount());
		//1. 3개의비디오반납
		vs.enQueue("메트릭스1"); //비디오반납
		vs.enQueue("메트릭스2"); //비디오반납
		vs.enQueue("메트릭스3"); //비디오반납
		System.out.println("보유한비디오갯수는" + vs.getCount());
		
		//2. 3개의비디오빌려줌
		temp = vs.deQueue(); 
		System.out.println(temp + " 빌림");
		temp = vs.deQueue(); 
		System.out.println(temp + " 빌림");
		temp = vs.deQueue(); 
		System.out.println(temp + " 빌림");
		System.out.println("보유한비디오갯수는" + vs.getCount());
	}

}
