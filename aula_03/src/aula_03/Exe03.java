package aula_03;
import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		// Para doar sangue � necess�rio ter entre 18 e 69 anos de idade. 
		//Pessoas com idade entre 60 e 69 anos, s� podem doar se n�o for a sua primeira doa��o.
		
		System.out.print("Digite o Nome do doador: ");
		nomeDoador = leia.nextLine();
		System.out.print("Digite a idade do doador: ");
		idadeDoador = leia.nextInt();
		System.out.print("Primeira doa��o de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if((idadeDoador < 18 || idadeDoador > 69) || (idadeDoador >= 60 && primeiraDoacao == true)) {
			System.out.println(nomeDoador + " n�o est� apto(a) para doar sangue!");
		}
		else {
			System.out.println(nomeDoador + " est� apto(a) para doar sangue!");
		}

	}

}
