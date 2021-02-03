package chapter08.interfaceEducation;

public abstract class RemoteTV implements IRemoteControl {
	protected int nChannel = 0;
	protected boolean bPower = false;
	public void powerOn() {
		bPower = true;
		System.out.println("TV 전원 On!");
	}
	public void powerOff() {
		bPower = false;
		System.out.println("TV 전원 Off!");
	}
	public void channelUp() {
		nChannel++;
		System.out.println("TV Ch. UP "+ nChannel);
	}
	//따로 해당 클래스를 상속받아서 channelDown을 오버라이딩하기 위해 추상 클래스로 만듦
}
