import java.util.Scanner;

public class ArrayMethod {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�迭�� ũ�⸦ �Է��Ͻÿ�.");
		int amount = sc.nextInt();
		int [] table = new int[amount];
		ArrayMethod.getValue(table);
		ArrayMethod.getAverage(table);
		ArrayMethod.printArray(table);
	}
	public static void getValue(int[] table) {
		for(int i=0;i<table.length;i++) {
			System.out.println("���ڸ� �Է��Ͻÿ�.");
			int a = sc.nextInt();
			table[i]=a;
		}
	}
	public static void getAverage(int[] table) {
		int sum=0;
		double avg=0.0;
		for(int i=0;i<table.length;i++) {
			sum=sum+table[i];
		}
		avg = (double)sum/table.length;
		System.out.println("�ڷ� ��� �� : "+avg);
	}
	public static void printArray(int[] table) {
		for(int i=0;i<table.length;i++) {
			System.out.print(" table["+i+"] = "+table[i]);
		}
	}
}
