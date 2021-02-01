package chapter04;

public class Test87page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=4;
		for(int i=0; i<line; i++) {
			

				for(int j=line-i; j>0; j--){
					System.out.print(" ");
				}
			for(int k=0; k<i*2+1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
