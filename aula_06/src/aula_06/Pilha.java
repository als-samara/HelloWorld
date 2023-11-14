package aula_06;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Aline"); // no lugar de add pode ser push também
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.add("Maria");
		
		pilha.pop(); // remove o ÚLTIMO elemento, AO CONTRÁRIO DA FILA que remove o primeiro
		System.out.println(pilha);
		
		System.out.println("O elemento que está no topo da pilha: " + pilha.peek()); // próximo elemento a ser removido...
		
		System.out.println("A Aline está na pilha? " + pilha.contains("Aline"));
		

	}

}
