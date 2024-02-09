package br.com.educ360.melhorada.calculadora.projeto;
public class Calculadora {

	// Private method
	private double sum(double v1, double v2) {
		return v1 + v2;
	}

	private double division(double v1, double v2) {
		return v1 / v2;
	}

	private double multiplication(double v1, double v2) {
		return v1 * v2;
	}

	private double subtration(double v1, double v2) {
		return v1 - v2;
	}

	private double restDivision(double v1, double v2) {
		return v1 % v2;
	}

	private double exponentiation(double v1, double v2) {
		return Math.pow(v1, v2);
	}

	private double raiz(double v1) {
		return Math.sqrt(v1);
	}

	private double pi(double pi) {
		return Math.PI;
	}

	private boolean prime(int v1) {
		if (v1 <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(v1); i++) {
				if (v1 % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean evenOrOdd(long v1) {
		if (v1 % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Public method
	public double calculation(double value1, char operation, double value2) {
		if (operation == '+') {
			return sum(value1, value2);

		} else if (operation == '/') {
			return division(value1, value2);

		} else if (operation == '*') {
			return multiplication(value1, value2);

		} else if (operation == '-') {
			return subtration(value1, value2);

		} else if (operation == '%') {
			return restDivision(value1, value2);

		} else if (operation == '^') {
			return exponentiation(value1, value2);

		} else {
			return 0;
		}

	}

	public double raizQuadrada(double value1) {
		return raiz(value1);
	}

	public double getPi(double pi) {
		return pi(pi);
	}

	public boolean getPrime(int value1) {
		return prime(value1);

	}

	public boolean getEvenOrOdd(long value1) {
		return evenOrOdd(value1);
	}
}
