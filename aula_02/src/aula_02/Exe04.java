package aula_02;
import java.util.Scanner;
public class Exe04 {
static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Quarto número: ");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		System.out.println(resultado);

	}

}
