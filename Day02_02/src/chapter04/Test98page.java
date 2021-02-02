package chapter04;

public class Test98page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops : for(int i =2 ;i<=9;i++){
			for(int j =1;j<=9;j++){
				if(j==5)
					break Loops; // Loops로 지정한 범위 바깥으로 나감
	//			break;
	//			continue Loops; 위에 있는 break랑 같은 역할
	//			continue; 
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
