package aula_03;
import java.util.Scanner;

public class Exe08 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float valor, saldo = 1000.00f;
		int codOp;
		
		System.out.println("\nDigite o n�mero correspondente � opera��o desejada: "
				+ 		 "\n1 - Saldo"
				+ 		 "\n2 - Saque"
				+ 		 "\n3 - Dep�sito");
		codOp = leia.nextInt();
		
		switch(codOp) {
			case 1:
				System.out.println("Opera��o - Saldo\r\n"
						+          "Saldo: " + saldo);
				break;
				
			case 2:
				System.out.println("Opera��o - Saque"
						+ 		   "\nDigite o valor de saque: ");
				valor = leia.nextFloat();	
					if(valor > saldo) {
						System.out.println("Saldo insuficiente");
					}else {
						saldo -= valor;
						System.out.println("Novo saldo: " + saldo);
					}
				break;
				
			case 3:
				System.out.println("Opera��o - Dep�sito"
						+ 		   "\nDigite o valor do dep�sito: ");
				valor = leia.nextFloat();	
				saldo += valor;
				System.out.println("Novo saldo: " + saldo);
				break;
		}

	}

}
