package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Integer> numerosInteiros = new HashSet<Integer>();
		int numeroDigitado;
		numerosInteiros.add(2);
		numerosInteiros.add(5);
		numerosInteiros.add(1);
		numerosInteiros.add(3);
		numerosInteiros.add(4);
		numerosInteiros.add(9);
		numerosInteiros.add(7);
		numerosInteiros.add(8);
		numerosInteiros.add(10);
		numerosInteiros.add(6);
		System.out.println("Digite o número que você quer encontrar");
		numeroDigitado = leia.nextInt();
		
		if(numerosInteiros.contains(numeroDigitado)) {
			System.out.println("O número " + numeroDigitado + " foi encontrado!");
		}else {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
		}

	}

}
