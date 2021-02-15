
public class ArrayStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1=0;
		for(int i = 0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : "+sum1);
		int sum2 = add(new int[] {83,90,87});
		// main은 static 메소드이므로 add같은 메소드는 static만 실행이 가능하다
		// non static은 객체를 만들어야 메모리에 올라가기 때문
		System.out.println("총합 : "+sum2);
		System.out.println();
	}
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		return sum;
	}

}
