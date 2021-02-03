package chapter07.variablel_length_arguments;

class Variable {
	public static void display(String ... strs){
		for(String s : strs) {
			System.out.println("가변배열형태: " + s);
			}
	}
}
