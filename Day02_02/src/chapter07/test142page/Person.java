package chapter07.test142page;

class Person {
	String name;
	int age;
	String job;
	// 밑에 생성자를 만들어서 name과 age를 따로 설정한 이유는
	// 보통 위에 선언하는 변수들은 private로 선언하기에
	// 따로 public으로 만들어서 외부에서 관리하기 위해 생성함
	public Person(String a, int b){ 
		this.name = a;
		this.age = b;
		}
}
