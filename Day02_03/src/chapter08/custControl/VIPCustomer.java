package chapter08.custControl;

class VIPCustomer extends Customer {
	private String manager;
	private int offer;
	public VIPCustomer(String id,String name) {
		this.id = id;
		this.name = name;
		this.grade = "VIP";
		this.manager = "김롯데";
		this.point = 10000;
		this.saving = 10;
		this.offer = 30;
	}
	public String toString() {
		return "고객의 아이디 : "+id+"\n고객의 이름 : "+name+"\n등급 : "+grade+"\n보너스 포인트 :"
				+point+"원\n고객의 적립비율 : "+saving+"%\n담당 매니저 : "+manager+"\n할인률 :"+offer+"%"				;
		
	}
}
