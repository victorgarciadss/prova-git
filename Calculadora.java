public class Calculadora {
	private double num1;
	private double num2;

	public double calculateNumbers(String simbol) {
		switch(simbol) {
			case '+': 
				return number1 + number2;
			case '-':
				return number1 - number2;
		}
	}

	public void setNum1(double num1) {
			this.num1 = num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
}
