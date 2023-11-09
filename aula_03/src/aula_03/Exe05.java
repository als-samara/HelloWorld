package aula_03;
import java.util.Scanner;

public class Exe05 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int codigo, quantidade;
		
		System.out.println("Itens: ");
		System.out.println("1 - Cachorro Quente "
				+ 			"\n2 - X-Salada "
				+ 			"\n3 - X-Bacon "
				+ 			"\n4 - Bauru "
				+ 			"\n5 - Refrigerante "
				+ 			"\n6 - Suco de laranja"
				+ 			"\nDigite o código do item: ");

		codigo = leia.nextInt();
		System.out.println("Escolha a quantidade do item: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Produto: Cachorro Quente\nValor a pagar: " + (quantidade*10));
			break;
		case 2:
			System.out.println("Produto: X-Salada\nValor a pagar: " + (quantidade*15));
			break;
		case 3:
			System.out.println("Produto: X-Bacon\nValor a pagar: " + (quantidade*18));
			break;
		case 4:
			System.out.println("Produto: Bauru\nValor a pagar: " + (quantidade*12));
			break;
		case 5:
			System.out.println("Produto: Refrigerante\nValor a pagar: " + (quantidade*8));
			break;
		case 6:
			System.out.println("Produto: Suco de laranja\nValor a pagar: " + (quantidade*13));
			break;
		default:
			System.out.println("Digite uma opção válida.");
		}
		
	}

}
