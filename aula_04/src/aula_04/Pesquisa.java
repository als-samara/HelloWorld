package aula_04;

import java.util.Scanner;

public class Pesquisa {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolMen18 = 0, outros = 0;

		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite seu esporte favorito: (1-fut/ 2-vol/ 3-Basq/ 4-Outros ");
				esporte = leia.nextInt();
				if(esporte < 1 || esporte > 4) {
					System.out.println("Por favor, digite um número entre 1 e 4.");
				}
			} while (esporte < 1 || esporte > 4);

			// quantas gostam futebol
			if (esporte == 1)
				futebol++;

			// voleibol e maior de 18 anos
			if (esporte == 2 && idade > 18)
				voleibolM18++;

			// basquete menor de 18
			if (esporte == 3 && idade < 18)
				basquetebolMen18++;

			// outros esportes
			if (esporte == 4)
				outros++;

			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R");
			continua = leia.nextLine();
		}

		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de voleibol e são maiores de 18 anos: " + voleibolM18);
		System.out.println("Total de pessoas que gostam de basquetebol e são menores de 18 anos: " + basquetebolMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + basquetebolMen18);
	}

}
