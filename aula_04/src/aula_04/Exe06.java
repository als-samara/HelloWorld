package aula_04;

import java.util.Scanner;

public class Exe06 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		double somaMultiploDe3=0, totalMultiploDe3=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if(numero % 3 == 0) {
				somaMultiploDe3 += numero;
				totalMultiploDe3++;
			}
		}while(numero != 0);
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + (somaMultiploDe3/(totalMultiploDe3-1)));
	}

}
