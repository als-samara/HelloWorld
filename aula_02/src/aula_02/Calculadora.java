package aula_02;

import java.util.Scanner;

public class Calculadora {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double numero1, numero2;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro n�mero: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtra�o: " + (numero1 - numero2));
		System.out.println("Divis�o: " + (numero1 / numero2));
		System.out.println("Multiplica��o: " + (numero1 * numero2));
		System.out.println("M�dulo do numero1(resto da divis�o): " + (numero1 % numero2));
		System.out.println("M�dulo do numero2(resto da divis�o): " + (numero2 % numero1));
		
		System.out.println("Raiz quadrada: " + Math.sqrt(numero1));
		System.out.println("Potencia��o do numero 1 pelo numero 2: " + Math.pow(numero1, numero2));
		
	}

}
