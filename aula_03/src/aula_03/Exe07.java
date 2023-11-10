package aula_03;
import java.util.Scanner;

public class Exe07 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float numero1, numero2;
		int operacao;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.print("\nDigite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nDigite o número correspondente à operação desejada: "
				+ 		 "\n1 - Soma"
				+ 		 "\n2 - Subtração"
				+ 		 "\n3 - Multiplicação"
				+ 		 "\n4 - Divisão");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.print(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.print(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.print(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.print(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
			default:
				System.out.print("Operação inválida");
		}

	}

}
