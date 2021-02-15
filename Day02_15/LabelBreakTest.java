
public class LabelBreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter : for(char upper='A';upper<='Z';upper++) {
					for(char lower='a';lower<='z';lower++) {
						System.out.println(upper+"-"+lower);
						if(lower=='g') {
							break Outter;
							//라벨이 없으면 Z까지 반복문 돌고 종료
						}
					}
		}
	System.out.println("프로그램 종료");
	}

}
