package chapter07.test142page;

class Student extends Person {
	public Student(String a, int b){
		super(a,b);
		this.job = "�л�";
		}
	public void Behavior(){
		System.out.println(name +" "+ age + "��"+ job + " �ൿ: ������..");
		}
}
