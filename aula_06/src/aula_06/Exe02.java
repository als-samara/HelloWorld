package aula_06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exe02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numerosInteiros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int numeroDigitado;
		
		System.out.println("Digite o n�mero que voc� quer encontrar");
		numeroDigitado = leia.nextInt();
		
		if(numerosInteiros.contains(numeroDigitado)) {
			System.out.println("O n�mero " + numeroDigitado + " est� na posi��o: " + numerosInteiros.indexOf(numeroDigitado));
		}else {
			System.out.println("O n�mero " + numeroDigitado + " n�o foi encontrado");
		}
		
	}

}
