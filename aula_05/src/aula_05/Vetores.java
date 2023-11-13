package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Ant�nio", "Vitor", "Samara" };

		float[] notas = new float[5];

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite um valor para a posi��o [" + indice + "] = ");
			notas[indice] = leia.nextFloat();
		}

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Posi��o " + (indice + 1) + " = " + notas[indice]);
		}

		Arrays.sort(pessoas);

		for (int indice = 0; indice < pessoas.length; indice++)
			System.out.println("Posi��o [" + indice + "] = " + pessoas[indice]);
		
		System.out.println("Localize o elemento da posi��o 02: " + Arrays.binarySearch(pessoas, "Aline")); // traz o indice que est� "Aline" em pessoas.
		
		for(String pessoa: pessoas){
			 System.out.println(pessoa);
			} // n�o da pra pegar o indice com esse, mas � menor verboso

	}

}
