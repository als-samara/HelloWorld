package aula_05;

import java.util.Scanner;

public class Exe01 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroProcurado;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		for(int i = 0; i < numeros.length; i ++) {
			if(numeroProcurado == numeros[i]) {
				System.out.println("O número " + numeroProcurado + " está na posição " + i);
			}
		}
	}

}
