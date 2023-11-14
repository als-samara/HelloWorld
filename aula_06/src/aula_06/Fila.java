package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
	
		fila.remove(); // retira o primeiro elemento quando não há argumentos (Aline)
		
		System.out.println(fila.peek()); // o peek não retira nenhum elemento, mas mostra o primeiro elemento
		
		System.out.println(fila.poll()); // o poll mostra o primeiro e també o retira (Pedro)
		System.out.println(fila);
		
		System.out.println("A Maria está na fila? " + fila.contains("Maria")); // true se estiver
		
		System.out.println("Número de elementos na fila: " + fila.size());
		
		
		
	}

}
