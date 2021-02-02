package chapter07.watch;

public class Watchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch watch1 = new Watch("ARMANI", 1, 30, 50);
		watch1.ToString(); 
		// ARMANI, 1, 30, 50
		System.out.println("시계의갯수는: "+ Watch.getWatch_Number() + "개");
		
		//**********************************************************************
		
		// static method인 getWatch를 호출하기 위해서는 Watch '클래스'를 먼저 치고 메소드를 호출
	}

}
