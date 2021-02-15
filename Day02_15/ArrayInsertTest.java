import java.util.Scanner;

public class ArrayInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0,jumsu;
		double avg=0.0;
		int[] table = new int[3];
		for(int i=0;i<table.length;i++) {
			System.out.println("점수 입력");
			jumsu=sc.nextInt();
			table[i] = jumsu;
			sum=sum+table[i];
		}
		avg=(double)sum/table.length;
		System.out.println("점수의 합 : "+sum+"\t평균 : "+avg);
		sc.close();
	}
}