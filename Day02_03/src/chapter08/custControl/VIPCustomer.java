package chapter08.custControl;

class VIPCustomer extends Customer {
	private String manager;
	private int offer;
	public VIPCustomer(String id,String name) {
		this.id = id;
		this.name = name;
		this.grade = "VIP";
		this.manager = "��Ե�";
		this.point = 10000;
		this.saving = 10;
		this.offer = 30;
	}
	public String toString() {
		return "���� ���̵� : "+id+"\n���� �̸� : "+name+"\n��� : "+grade+"\n���ʽ� ����Ʈ :"
				+point+"��\n���� �������� : "+saving+"%\n��� �Ŵ��� : "+manager+"\n���η� :"+offer+"%"				;
		
	}
}
