package chapter04;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				count++;
				continue;
			}
			System.out.printf("%d\n",i);
		}
		System.out.printf("3의 배수 개수 : %d\n",count);
	}

}
