package chapter08.arrayOfObjects;

public class Dog {
	private String name;
	private String type;

	public Dog(String a, String b) {
		this.name = a;
		this.type = b;
	}
	public String getName() {
		return name;
	}
	public void setName(String a) {
		this.name = a;
	}
	public String getType() {
		return type;
	}
	public void setType(String a) {
		this.type = a;
	}
	public String toString() {
		return "견종 :"+this.type+"\n이름 :" + this.name+"\n";
		
	}
}	
