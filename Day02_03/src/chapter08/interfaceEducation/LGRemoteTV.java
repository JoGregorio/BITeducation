package chapter08.interfaceEducation;

public class LGRemoteTV extends RemoteTV {
	public void channelDown() {
		nChannel --;
		System.out.println("TV Ch. Down +"+nChannel);
	}
}
