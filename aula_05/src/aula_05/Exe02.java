package aula_05;

import java.util.Arrays;
import java.util.Scanner;


public class Exe02 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numerosInteiros = new int[10];
		int[] impares = new int [5];
		int[] pares = new int [10];
		int leitura = 0, contadorImpares = 0, contadorPares = 0;
		float soma = 0.0f, media;
		
		
		while(leitura < numerosInteiros.length) {
			System.out.println("Digite um número");
			numerosInteiros[leitura] = leia.nextInt();
			leitura++;
		}		
		
		for(int i = 0; i < numerosInteiros.length; i++) {
			if(i % 2 != 0) {
				impares[contadorImpares] = numerosInteiros[i];
				contadorImpares ++;
			}
			if(numerosInteiros[i] % 2 == 0) {
				pares[contadorPares] = numerosInteiros[i];
				contadorPares ++;
			}
			soma += numerosInteiros[i];
			
		}
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int el : impares) {
			System.out.println(el);
		}
		
		System.out.println("Elementos pares");
		for(int el : pares) {
			if(el != 0)
			System.out.println(el);
		}
		
		
		media = soma/numerosInteiros.length;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
			
		
		
	}

}
