package chapter07.test142page;

class Professor extends Person {
	public Professor(String a, int b){
		super(a,b);
		this.job = "교수";
	}
	public void Behavior(){
		System.out.println(name +" "+ age + "세"+ job + " 행동: 과제내는중..");
	}
}
