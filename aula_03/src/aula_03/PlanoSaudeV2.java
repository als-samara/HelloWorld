package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int faixaIdade;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Faixas et�rias");
		System.out.println("1 - De 0 a 10 anos");
		System.out.println("2 - De 11 a 29 anos");
		System.out.println("3 - De 30 a 45 anos");
		System.out.println("4 - De 46 a 59 anos");
		System.out.println("5 - De 60 a 65 anos");
		System.out.println("6 - Acima de 65 anos");
		
		System.out.print("\nDigite o n�mero correspondente a sua faixa et�ria: ");
		faixaIdade = leia.nextInt();
		
		switch(faixaIdade) {
			case 1:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#100,00 por m�s.", nome);
				break;
			case 2:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#200,00 por m�s.", nome);
				break;
			case 3:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#300,00 por m�s.", nome);
				break;
			case 4:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#500,00 por m�s.", nome);
				break;
			case 5:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#600,00 por m�s.", nome);
				break;
			case 6:
				System.out.printf("%s, o seu Plano de Sa�de custar� R#1000,00 por m�s.", nome);
				break;
			default:
					System.out.println("Faixa et�ria inv�lida! Digite um valor entre 1 e 6.");
					
		}

	}

}
