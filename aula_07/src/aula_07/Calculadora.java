package aula_07;

import java.util.Scanner;

public class Calculadora {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, opcao;

		while (true) {
			System.out.println("1 - Somar\n" + "2 - Subtrair\n" + "3 - Multiplicar\n" + "4 - Dividir\n" + "0 - Sair\n"
					+ "Qual opera��o matem�tica deseja realizar?");
			opcao = leia.nextInt();
			
			if(opcao == 0) {
				sobre();
				System.exit(0);;
			}
			System.out.println("Digite o primeiro n�mero: ");
			num1 = leia.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			num2 = leia.nextInt();

			switch (opcao) {
			case 1 -> System.out.println("Soma: " + somar(num1, num2));
			case 2 -> System.out.println("Subtra��o: " + subtrair(num1, num2));
			case 3 -> System.out.println("Multiplica��o: " + multiplicar(num1, num2));
			case 4 -> System.out.println("Divis�o: " + dividir(num1, num2));
			default -> System.out.println("Op��o inv�lida!");
			}

		}
	}

	static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	} 
	
	/* M�todos com o mesmo nome e assinaturas diferentes trata-se de sobrecarga de m�todo 
	 * */
	
	static int subtrair(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	static int dividir(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	static void sobre() {
		System.out.println("Calculadora com M�todos");
		System.out.println("By Samara");
	}
}
