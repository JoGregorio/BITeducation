
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val1 = "신민철";
		String val2 = "신민철";
		if(val1==val2) {
			System.out.println("val1과 val2는 참조가 같음");
		}
		else System.out.println("val1과 val2는 참조가 다름");
		if(val1.equals(val2)) {
			System.out.println("val1과 val2는 문자열이 같음");
		}
		String val3 = new String("신민철");
		String val4 = new String("신민철");
		if(val3==val4) {
			System.out.println("val3과 val4는 참조가 같음");
		}
		else System.out.println("val3과 val4는 참조가 다름");
		if(val3.equals(val4)) System.out.println("val3과 val4는 문자열이 같음");
	}

}
