package aula_02;
import java.util.Scanner;
public class Exe04 {
static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Primeiro n�mero: ");
		n1 = leia.nextFloat();
		System.out.println("Segundo n�mero: ");
		n2 = leia.nextFloat();
		System.out.println("Terceiro n�mero: ");
		n3 = leia.nextFloat();
		System.out.println("Quarto n�mero: ");
		n4 = leia.nextFloat();
		
		resultado = (n1*n2) - (n3*n4);
		System.out.println(resultado);

	}

}
