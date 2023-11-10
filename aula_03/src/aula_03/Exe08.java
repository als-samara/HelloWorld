package aula_03;
import java.util.Scanner;

public class Exe08 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float valor, saldo = 1000.00f;
		int codOp;
		
		System.out.println("\nDigite o número correspondente à operação desejada: "
				+ 		 "\n1 - Saldo"
				+ 		 "\n2 - Saque"
				+ 		 "\n3 - Depósito");
		codOp = leia.nextInt();
		
		switch(codOp) {
			case 1:
				System.out.println("Operação - Saldo\r\n"
						+          "Saldo: " + saldo);
				break;
				
			case 2:
				System.out.println("Operação - Saque"
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
				System.out.println("Operação - Depósito"
						+ 		   "\nDigite o valor do depósito: ");
				valor = leia.nextFloat();	
				saldo += valor;
				System.out.println("Novo saldo: " + saldo);
				break;
		}

	}

}
