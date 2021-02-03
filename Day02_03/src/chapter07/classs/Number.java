package chapter07.classs;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntNumber com1 = new IntNumber(6, 17);
		IntNumber com2 = com1.add(com1);
		System.out.println(com1.getNum1() +" "+ com1.getNum2());
		System.out.println(com2.getNum1() +" "+ com2.getNum2());
	}

}
