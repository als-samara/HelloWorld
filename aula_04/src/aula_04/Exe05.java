package aula_04;

import java.util.Scanner;

public class Exe05 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero = 1, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if(numero > 0) {
				soma += numero;
			}
		}while(numero != 0);
		
		System.out.println("A soma dos números inteiros positivos é: " + soma);

	}

}
