package aula_02;

import java.util.Scanner;

public class Calculadora {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double numero1, numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o primeiro número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + (numero1 + numero2));
		System.out.println("Subtraão: " + (numero1 - numero2));
		System.out.println("Divisão: " + (numero1 / numero2));
		System.out.println("Multiplicação: " + (numero1 * numero2));
		System.out.println("Módulo do numero1(resto da divisão): " + (numero1 % numero2));
		System.out.println("Módulo do numero2(resto da divisão): " + (numero2 % numero1));
		
		System.out.println("Raiz quadrada: " + Math.sqrt(numero1));
		System.out.println("Potenciação do numero 1 pelo numero 2: " + Math.pow(numero1, numero2));
		
	}

}
