import java.util.Arrays;
public class ArrayCopyByFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1,2,3};
		int[] newArray = new int[3];
		// for문으로 배열 복사
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+", ");
		}
		if(oldArray==newArray) System.out.println("참조 주소 같음");
		else System.out.println("참조 주소 다름");
		
		
		System.out.println();
		int[] newArray2 = new int[3];
		// arraycopy 메소드 이용
		System.arraycopy(oldArray, 0, newArray2, 0, oldArray.length);
		for(int i=0;i<newArray2.length;i++) {
			System.out.print(newArray2[i]+", ");
		}
		if(oldArray==newArray2) System.out.println("참조 주소 같음");
		else System.out.println("참조 주소 다름");
		System.out.println();
		
		
		// Arrays 클래스 이용
		int[] newArray3 = Arrays.copyOf(oldArray, oldArray.length);		
		for(int i=0;i<newArray3.length;i++) {
			System.out.print(newArray3[i]+", ");
		}
		if(oldArray==newArray3) System.out.println("참조 주소 같음");
		else System.out.println("참조 주소 다름");
		
	}
}