package br.com.educ360.melhorada.calculadora.projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Color
		String color = "\u001B[47;1;30m", g = "\u001B[92m", n = "\u001B[1m", m = "\u001B[1;35m", c = "\u001B[1;36m",
				y = "\u001B[1;33m", r = "\u001B[1;91m", stop = "\u001B[0m";
		// System
		try {
			try (Scanner input = new Scanner(System.in)) {
				Calculadora calcular = new Calculadora();
				String escolha;
				int menu;

				System.out.println(color + "\n*** Welcome to the new calculator concept! *** \n"
						+ "▼ Please, Choose an option from the calculator ▼ \n" + stop);

				while (true) {

					System.out.print(c + " 🗒️ OPTIONS MENU 🗒️\n" + stop +
							   n + " - (1) simple calculator\n" 
								 + " - (2) Square root\n"
								 + " - (3) Prime number\n"
								 + " - (4) Even or odd\n"
								 + " - (5) Pi number\n"
								 + " - (6) Exit\n" + stop
								 + g + "Choose an option: " + stop);
					menu = input.nextInt();

					switch (menu) {

					case 1:

						System.out.println(c + "\n📍 SIMPLE CALCULATOR 📍\n" + stop);

						do {
							System.out.print(y + "Enter the value: " + stop);
							double value1 = input.nextDouble();

							System.out.print(y + "Insert an operator " + stop + n + "(+, -, *, /, %, ^,): " + stop);
							char operation = input.next().charAt(0);

							System.out.print(y + "Enter the value: " + stop);
							double value2 = input.nextDouble();

							double result = calcular.calculation(value1, operation, value2);

							System.out.println(g + "Result of the operation is: " + stop + n + result + "\n" + stop);
							System.out.println(g + "The last calculation was (" + stop + n + value1 + " " + operation
									+ " " + value2 + stop + g + ") and the result was: " + stop + n + result + "\n"
									+ stop);

							System.out.println(n + "New calculation? insert (S): ");
							System.out.println("Exit to menu, insert (N): " + stop);
							escolha = input.next();

						} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não")
								&& !escolha.equals("NÃO") && !escolha.equals("Not") && !escolha.equals("NOT"));
						System.out.println(m + "Thank you for using the" + stop + n + " Simple calculator.\n\n" + stop);
						;

						break;

					case 2:

						System.out.println(c + "\n📍 SQUARE ROOT 📍\n" + stop);

						do {
							System.out.print(y + "Enter the value: " + stop);
							double value1 = input.nextDouble();

							double result = calcular.raizQuadrada(value1);

							System.out.println(g + "The square root to: " + stop + n + value1 + stop + g + " is " + stop
									+ n + result + "\n" + stop);
							System.out.println(g + "The last calculation was (" + stop + n + value1 + stop + g
									+ ") and the result was: " + stop + n + result + "\n" + stop);

							System.out.println(n + "New calculation? insert (S): ");
							System.out.println("Exit to menu, insert (N): " + stop);
							escolha = input.next();

						} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não")
								&& !escolha.equals("NÃO") && !escolha.equals("Not") && !escolha.equals("NOT"));
						System.out.println(y + "Thank you for using the" + stop + n + " Square root.\n\n" + stop);

						break;

					case 3:

						System.out.println(c + "\n📍 PRIME NUMBER 📍\n" + stop);

						do {
							System.out.print(y + "Enter the number: " + stop);
							int value1 = input.nextInt();

							boolean result = calcular.getPrime(value1);

							System.out.println(g + "The number is prime: " + stop + n + result + "\n" + stop);
							System.out.println(g + "The last value was (" + stop + n + value1 + stop + g
									+ ") and the result was: " + stop + n + result + "\n" + stop);

							System.out.println(n + "New test? insert (S): ");
							System.out.println("Exit to menu, inset (N): " + stop);
							escolha = input.next();

						} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não")
								&& !escolha.equals("NÃO") && !escolha.equals("Not") && !escolha.equals("NOT"));
						System.out.println(m + "Thank you for using the" + stop + n + " Prime number.\n\n" + stop);

						break;

					case 4:

						System.out.println(c + "\n📍 EVEN OR ODD 📍\n" + stop);

						do {
							System.out.print(y + "Enter the value: " + stop);
							long value1 = input.nextLong();

							boolean result = calcular.getEvenOrOdd(value1);

							System.out.println(g + "The number is pair: " + stop + n + result + "\n" + stop);
							System.out.println(g + "The last value was (" + stop + n + value1 + stop + g
									+ ") and the result was: " + stop + n + result + "\n" + stop);

							System.out.println(n + "New test? insert (S): ");
							System.out.println("Exit to menu, inset (N): " + stop);
							escolha = input.next();

						} while (!escolha.equals("n") && !escolha.equals("N") && !escolha.equals("não")
								&& !escolha.equals("NÃO") && !escolha.equals("Not") && !escolha.equals("NOT"));
						System.out.println(m + "Thank you for using the" + stop + n + "  Even or Odd.\n\n" + stop);

						break;

					case 5:

						System.out.println(c + "\n📍 PI NUMBER 📍\n" + stop);

						System.out.println(g + "Pi number is: " + stop + n + calcular.getPi(0) + stop + g
								+ "\n\nThe value that is closest to any other, the ratio between the circumference of a circle and its diameter."
								+ stop);

						System.out.println(n + "\n*** Press enter to return to the menu ***" + stop);
						input.nextLine();
						input.nextLine();

						break;

					case 6:

						System.out.println(y + "Thank you for using calculator" + stop + n + " 👍 " + stop);

						break;
					default:
						System.out.println(r + "Sorry invalid option, try again.\n" + stop);

						break;

					}
				}
			}
		} catch (Exception e) {
			System.out.println(r + "Exception Error! - Please enter a number and not a letter." + stop);
		}
	}
}
