package aula_03;
import java.util.Scanner;

public class Exe07 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float numero1, numero2;
		int operacao;
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = leia.nextFloat();
		System.out.print("\nDigite o segundo n�mero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nDigite o n�mero correspondente � opera��o desejada: "
				+ 		 "\n1 - Soma"
				+ 		 "\n2 - Subtra��o"
				+ 		 "\n3 - Multiplica��o"
				+ 		 "\n4 - Divis�o");
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
				System.out.print("Opera��o inv�lida");
		}

	}

}
