package chapter08.interfaceEducation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LGRemoteTV tv = new LGRemoteTV();
		BWPrinter p1 = new BWPrinter();
		ColorPrint p2 = new ColorPrint();
		
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		p1.printOut();
		p2.printOut();
	}

}
