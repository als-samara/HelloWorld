package aula_02;

import java.util.Scanner;

public class Operadores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1 = 10, numero2 = 20;
		String valor1 = "2", valor2 = "3";
		
		String nome = "Samara";
		int idade = 26;
		float media = 2.456789f;
		
		System.out.println("A soma das vari�veis numero1 e numero2 � igual a: " + (numero1 + numero2)); // somou
		System.out.println("A soma das vari�veis vaor1 e valor2 � igual a: " + (valor1 + valor2)); // concatenou
		
		System.out.printf("A m�dia final da %s � %.2f ", nome, media);
		
		System.out.println("Digite o tamanho: ");
		int tamanho = leia.nextInt();
		System.out.println("O tamanho �: " + tamanho);
	}

}
