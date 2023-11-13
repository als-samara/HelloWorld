package aula_05;

import java.util.Scanner;

public class Exe04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float[][] matrizNotas = new float [2][4];
		float soma = 0.0f;
		float[] media = new float[2];
		
		for(int i = 0; i < matrizNotas.length; i++) {
			for(int j = 0; j < matrizNotas[i].length; j++) {
				System.out.println("Digite a nota do bimestre " + (j+1) + " do aluno");
				matrizNotas[i][j] = leia.nextFloat();
			}
		}
		
		for(int i=0; i < matrizNotas.length; i++) {
			for(int j=0; j < matrizNotas[i].length; j++) {
				soma += matrizNotas[i][j];
			}
			media[i] = soma/matrizNotas[i].length;
			System.out.printf("Média do aluno na linha " + i + ": %.1f", media[i]);
			soma = 0.0f;
		}
		
		

	}

}
