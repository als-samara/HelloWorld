package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exe03 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		int numeroDigitado;
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite um número e não o repita: ");
			numeros.add(numeroDigitado = leia.nextInt());
		}
		
		Iterator<Integer> iNum = numeros.iterator();
		while(iNum.hasNext())
			System.out.println(iNum.next());
		
		
	}

}
