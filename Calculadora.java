public class Calculadora {
	private int num1;
	private int num2;

	public int calculateNumbers(String simbol) {
		switch(simbol) {
			case '+': 
				return num1 + num2;
			case '-':
				return num1 - num2;
		}
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
