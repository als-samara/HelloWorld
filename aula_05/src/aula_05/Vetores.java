package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Antônio", "Vitor", "Samara" };

		float[] notas = new float[5];

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "] = ");
			notas[indice] = leia.nextFloat();
		}

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Posição " + (indice + 1) + " = " + notas[indice]);
		}

		Arrays.sort(pessoas);

		for (int indice = 0; indice < pessoas.length; indice++)
			System.out.println("Posição [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("Localize o elemento da posição 02: " + Arrays.binarySearch(pessoas, "Aline")); // traz o indice que está "Aline" em pessoas.
		
		for(String pessoa: pessoas){
			 System.out.println(pessoa);
			} // não da pra pegar o indice com esse, mas é menor verboso

	}

}
