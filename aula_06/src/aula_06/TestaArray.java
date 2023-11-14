package aula_06;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArray {
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		// mostra na tela todas as notas inseridas
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		// Mostra uma determinada nota existente na lista (método contains)
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		// Modificar um valor (indice, novoValor)
		notas.set(1, 6.0d);
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		notas.remove(1); // remove o elemento do índice informado
		System.out.println("\nNotas cadastradas: " + notas.toString());
		
		// Checa se a lista está vazia
		System.out.println("\nA lista está vazia? " + notas.isEmpty());
		
		// Mostra o tamanho da lista
		System.out.println("\nTamanho da lista (número de elementos): " + notas.size());
		
		// Exibe o maior valor da lista
		System.out.println("\nMaior elemento da lista: " + Collections.max(notas));
		
		// Exibe o menor valor da lista
		System.out.println("\nMaior elemento da lista: " + Collections.min(notas));
				
		// Limpa a lista
		// notas.clear();
		// System.out.println("\nA lista está vazia: " + notas.toString());
		
		System.out.println(("Posição do elemento 7.0: " + notas.indexOf(7.0)));
		System.out.println("Elemento na posição 0: " + notas.get(0));
		
		notas.forEach(System.out::println); // forma simplificada de fazer o forEach (el : els)
		
	}
}
