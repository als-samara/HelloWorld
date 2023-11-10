package aula_04;

import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int backend = 0, mulheresFrontend = 0, homMobMais40 = 0, nbFullStMenos30 = 0, total = 0, mediaIdade = 0,
				divisorMedia = 0, idGenero, stack, idadeAtual;
		String opcao = "S";

		while (opcao.equalsIgnoreCase("s")) {
			System.out.print("Digite sua idade: ");
			idadeAtual = leia.nextInt();
			mediaIdade += idadeAtual;
			total++;

			System.out.println("Selecione sua identidade de gênero: " 
							 + "\n1 - Mulher Cis" 
							 + "\n2 - Homem Cis"
							 + "\n3 - Não Binário" 
							 + "\n4 - Mulher Trans" 
							 + "\n5 - Homem Trans" 
							 + "\n6 - Outros ");
			idGenero = leia.nextInt();

			System.out.println("Selecione sua stack: " 
							 + "\n1 - Backend" 
							 + "\n2 - Frontend" 
							 + "\n3 - Mobile" 
							 + "\n4 - Full-Stack");
			stack = leia.nextInt();

			if (stack == 1)
				backend++;

			if ((idGenero == 1 || idGenero == 4) && stack == 2)
				mulheresFrontend++; 
			
			if ((idGenero == 2 || idGenero == 5) && stack == 3 && idadeAtual > 40)
				homMobMais40++;
			
			if (idGenero == 3 && stack == 4 && idadeAtual < 30)
				nbFullStMenos30++;
			
			System.out.println("Deseja continuar inserindo dados de outro funcionário? (S ou N)");
			opcao = leia.next();
		}	
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homMobMais40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFullStMenos30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
		System.out.println("A média de idade das pessoas que responderam à pesquisa :" + (mediaIdade/total));
	}

}
