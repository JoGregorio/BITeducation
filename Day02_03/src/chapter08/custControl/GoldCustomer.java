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
		return "고객의 아이디 : "+id+"\n고객의 이름 : "+name+"\n등급 : "+grade+"\n보너스 포인트 :"
				+point+"원\n고객의 적립비율 : "+saving+"%\n할인률 :"+offer+"%"				;
		
	}
}
