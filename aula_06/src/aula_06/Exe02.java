package aula_06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exe02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int numeroDigitado;
		
		System.out.println("Digite o número que você quer encontrar");
		numeroDigitado = leia.nextInt();
		
		if(numerosInteiros.contains(numeroDigitado)) {
			System.out.println("O número " + numeroDigitado + " está na posição: " + numerosInteiros.indexOf(numeroDigitado));
		}else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado");
		}
		
	}

}
