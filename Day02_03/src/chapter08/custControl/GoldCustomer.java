package chapter08.custControl;

class GoldCustomer extends Customer {
	private int offer;
	public GoldCustomer(String id,String name) {
		this.id = id;
		this.name = name;
		this.grade = "Gold";
		this.point = 5000;
		this.saving = 5;
		this.offer = 15;
	}
	public String toString() {
		return "���� ���̵� : "+id+"\n���� �̸� : "+name+"\n��� : "+grade+"\n���ʽ� ����Ʈ :"
				+point+"��\n���� �������� : "+saving+"%\n���η� :"+offer+"%"				;
		
	}
}
