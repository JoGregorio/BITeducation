package chapter07.test142page;

class Student extends Person {
	public Student(String a, int b){
		super(a,b);
		this.job = "切积";
		}
	public void Behavior(){
		System.out.println(name +" "+ age + "技"+ job + " 青悼: 苞力吝..");
		}
}
