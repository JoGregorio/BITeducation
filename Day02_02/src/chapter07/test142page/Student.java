package chapter07.test142page;

class Student extends Person {
	public Student(String a, int b){
		super(a,b);
		this.job = "학생";
		}
	public void Behavior(){
		System.out.println(name +" "+ age + "세"+ job + " 행동: 과제중..");
		}
}
