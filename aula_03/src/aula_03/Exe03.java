package aula_03;
import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		
		System.out.print("Digite o Nome do doador: ");
		nomeDoador = leia.nextLine();
		System.out.print("Digite a idade do doador: ");
		idadeDoador = leia.nextInt();
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if((idadeDoador < 18 || idadeDoador > 69) || (idadeDoador >= 60 && primeiraDoacao == true)) {
			System.out.println(nomeDoador + " não está apto(a) para doar sangue!");
		}
		else {
			System.out.println(nomeDoador + " está apto(a) para doar sangue!");
		}

	}

}
