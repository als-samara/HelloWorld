package aula_05;

import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matriz = new int [3][3];
		int somaP = 0, somaS = 0;
		String diagonalP = "", diagonalS = " ";
		
		for(int indiceL = 0; indiceL < matriz.length; indiceL ++) {
			for(int indiceC = 0; indiceC < matriz[indiceL].length; indiceC ++) {
				System.out.println("Digite o número da posição: (" + indiceL + "," + indiceC + "): ");
				matriz[indiceL][indiceC] = leia.nextInt();
			}
		}
		
		for(int indice = 0; indice < matriz.length; indice ++) {
			diagonalP += matriz[indice][indice] + " ";
			somaP += matriz[indice][indice];
		}
		
		for(int indice = 0;indice < matriz.length; indice++) {
			diagonalS += matriz[indice][matriz.length - 1 - indice] + " ";
			somaS += matriz[indice][matriz.length - 1 - indice];
		}
		
		System.out.println("Elementos da Diagonal Principal: " + diagonalP);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);
		System.out.println("Elementos da Diagonal Secundária: " + diagonalS);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);

	}

}
