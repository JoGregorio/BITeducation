package chapter07.test142page;

class Professor extends Person {
	public Professor(String a, int b){
		super(a,b);
		this.job = "����";
	}
	public void Behavior(){
		System.out.println(name +" "+ age + "��"+ job + " �ൿ: ����������..");
	}
}
