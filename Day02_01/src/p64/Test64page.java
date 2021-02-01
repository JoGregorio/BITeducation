package p64;

public class Test64page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = {'A','B','C','D'};
		System.out.println(str1);
		System.out.println(str1.length);
		
		String a = "hello";
		String b = "Hello";
		String ssn = "950202-1124444";
		
		//b에서 ll을 추출
		System.out.println(b.substring(2, 4));
		//b를 소문자로 변환
		System.out.println(b.toLowerCase());
		//b를 대문자로 변환
		System.out.println(b.toUpperCase());
		//ssn에서 남녀를 추출하려면
		if((ssn.substring(7,8)).equals("1")) System.out.println("남성");
		else System.out.println("여성");
		// System.out.println(ssn.charAt(7) == '1' ? "Man" : "Woman");
		//c의 길이는
		System.out.println(ssn.length());
		
		
		
		// String 클래스로 객체를 만들 때 str1 = "A" 했다가 str1 = "DBC" 하면 A가 사라지는 것이 아니라
		// DCB의 주소를 가져다가 쓰는 것이고 A로 연결된 포인터가 끊어지는 개념 즉, A는 메모리에 살아있음
		// new 객체로 만들경우 객체별로 메모리를 따로 할당함, new 안쓰고 str3 = "A"처럼 같은 문자를 사용하면
		// A의 주소를 str1과 str3가 같이 연결해서 사용하는 개념(포인터로)
		
		
	}

}
