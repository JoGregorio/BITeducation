package chapter07.variablel_length_arguments;

class Variable {
	public static void display(String ... strs){
		for(String s : strs) {
			System.out.println("�����迭����: " + s);
			}
	}
}
