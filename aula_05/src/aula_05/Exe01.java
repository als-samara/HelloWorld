package aula_05;

import java.util.Scanner;

public class Exe01 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroProcurado;
		boolean encontrado = true;
		
		System.out.print("Digite o n�mero que voc� deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		for(int i = 0; i < numeros.length; i ++) {
			if(numeroProcurado == numeros[i]) {
				System.out.println("O n�mero " + numeroProcurado + " est� na posi��o " + i);
				encontrado = true;
				break;
			}else {
				encontrado = false;
			}
			
			if(i == numeros.length - 1 && encontrado == false && numeroProcurado != numeros[i]) {
				System.out.println("O n�mero " + numeroProcurado + " n�o foi encontrado ");
			}
		}
		
		/*
		 for(int indice = 0; indice < vetor.length; indice++){
		 	if(vetor[indice] == numero)
		 	resultado = indice;
		  }
		  if(resultado == 0) - imprimir numero n�o localizado
		  else - foi localizado
		 
		 */
		
	}

}
