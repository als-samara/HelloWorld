package aula_03;
import java.util.Scanner;
public class Exe02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		
		System.out.print("Digite um número.");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero >= 0) {
			System.out.println("\n O número " + numero + " é par e positivo");
		}else if(numero % 2 != 0 && numero >= 0){
			System.out.println("\n O número " + numero + " é ímpar e positivo");
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("\n O número " + numero + " é par e negativo");
		}else {
			System.out.println("\n O número " + numero + " é ímpar e negativo");
		}

	}

}
