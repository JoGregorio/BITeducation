import java.util.Arrays;
public class ArrayCopyByFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1,2,3};
		int[] newArray = new int[3];
		// for������ �迭 ����
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+", ");
		}
		if(oldArray==newArray) System.out.println("���� �ּ� ����");
		else System.out.println("���� �ּ� �ٸ�");
		
		
		System.out.println();
		int[] newArray2 = new int[3];
		// arraycopy �޼ҵ� �̿�
		System.arraycopy(oldArray, 0, newArray2, 0, oldArray.length);
		for(int i=0;i<newArray2.length;i++) {
			System.out.print(newArray2[i]+", ");
		}
		if(oldArray==newArray2) System.out.println("���� �ּ� ����");
		else System.out.println("���� �ּ� �ٸ�");
		System.out.println();
		
		
		// Arrays Ŭ���� �̿�
		int[] newArray3 = Arrays.copyOf(oldArray, oldArray.length);		
		for(int i=0;i<newArray3.length;i++) {
			System.out.print(newArray3[i]+", ");
		}
		if(oldArray==newArray3) System.out.println("���� �ּ� ����");
		else System.out.println("���� �ּ� �ٸ�");
		
	}
}