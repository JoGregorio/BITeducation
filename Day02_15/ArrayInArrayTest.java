import java.util.Scanner;

public class ArrayInArrayTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<board.length;i++) {
			for(int k=0;k<board[i].length;k++) {
				System.out.println(i+1+"�� �л��� ������ �Է��Ͻÿ�.");
				int temp = sc.nextInt();
				board[i][k]=temp;
			}
		}
		int sum=0; double avg=0.0;
		for(int i=0;i<board.length;i++) {
			for(int k=0;k<board[i].length;k++) {
				sum=sum+board[i][k];
			}
			avg=(double)sum/board[i].length;
			System.out.println(i+1+"�� �л��� ���� : "+sum+"\t��� : "+avg);
			sum=0;
		}
		sc.close();
	}
}
