import java.util.Scanner;

public class DisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단어를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String check;
		int len=0,m=0,j=0;
		check = sc.next();
		len=check.length();
		for(int i=0;i<len;i++) {
			switch(check.charAt(i)) {
			case 'a':case 'e':case 'o':case 'u':case 'i':{
				m++;
				break;
			}
			case 'A' :case 'E':case 'O':case 'U':case 'I':{
				m++;
				break;
			}
			default:{
				j++;
				break;
			}
			}
		}
		System.out.println("모음의 갯수 : "+m);
		System.out.println("자음의 갯수 : "+j);
	}

}
