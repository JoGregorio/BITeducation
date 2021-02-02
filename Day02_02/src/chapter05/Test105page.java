package chapter05;

import java.util.Scanner;

public class Test105page {
	final static int STUDENT = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[STUDENT];
		
		getAverage(scores);
		getValue(scores);
		printScore(scores);
	}

	private static void printScore(int[] scores) {
		// TODO Auto-generated method stub
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i]+"\t");
		}
	}

	private static void getAverage(int[] array) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < array.length; i++){ // for(int score : array)로 바꿔도 무방
			System.out.println("성적을입력하시오: ");
			array[i] = sc.nextInt();
			}
	}

	private static void getValue(int[] array) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0; i < array.length; i++)total += array[i];
		System.out.println("평균: "+ total / array.length);}
	}

