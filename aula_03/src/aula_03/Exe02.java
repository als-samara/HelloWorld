package aula_03;
import java.util.Scanner;
public class Exe02 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		
		System.out.print("Digite um n�mero.");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero >= 0) {
			System.out.println("\n O n�mero " + numero + " � par e positivo");
		}else if(numero % 2 != 0 && numero >= 0){
			System.out.println("\n O n�mero " + numero + " � �mpar e positivo");
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("\n O n�mero " + numero + " � par e negativo");
		}else {
			System.out.println("\n O n�mero " + numero + " � �mpar e negativo");
		}

	}

}
