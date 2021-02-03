package chapter08.calc;

class New_Calc extends Calc {
	
	public int calculate(int a, int b, char c) {
		if(c=='+') return plus(a,b);
		else if(c=='-') return minus(a,b);
		else if(c=='*') return multiply(a,b);
		else if(c=='/') return divide(a,b);
		return 0;
	}

	
	@Override
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
