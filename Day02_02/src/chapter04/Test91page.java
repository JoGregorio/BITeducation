package chapter04;

public class Test91page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		System.out.println("구구단출력");
		while(i<=9){
			int j = 1;
			while(j<=9){
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
		}
	}

}
