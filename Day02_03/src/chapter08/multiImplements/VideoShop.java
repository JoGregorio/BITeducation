package chapter08.multiImplements;

public class VideoShop extends Shop implements IQueue {

	@Override
	public void enQueue(String video) {
		// TODO Auto-generated method stub
		System.out.println(video + "�ݳ�");
		this.store.addElement(video);
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return (String)this.store.remove(0);
	}
	
}
