package chapter04;

public class Test98page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops : for(int i =2 ;i<=9;i++){
			for(int j =1;j<=9;j++){
				if(j==5)
					break Loops; // Loops�� ������ ���� �ٱ����� ����
	//			break;
	//			continue Loops; ���� �ִ� break�� ���� ����
	//			continue; 
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}