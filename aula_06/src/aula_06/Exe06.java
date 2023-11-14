package aula_06;

import java.util.Stack;
import java.util.Scanner;

public class Exe06 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int opcao = 1;
		String nomeLivro;

		while (opcao != 0) {
			System.out.println("Digite a opção desejada: " + "\n1 - Adicionar livro na pilha"
					+ "\n2 - Listar todos os livros" + "\n3 - Retirar livro da pilha" + "\n0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				nomeLivro = leia.next();
				pilha.add(nomeLivro);
				System.out.println("Pilha: " + pilha + "\nLivro adicionado!\n");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!\n");
				} else {
					System.out.println("Lista de Livros na Pilha: " + pilha + "\n");
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!\n");
				} else {
					String livro = pilha.pop();
					System.out.println("Pilha\n" + pilha + "\nO livro " + livro + " foi retirado da pilha\n");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida");
			}

		}

	}

}
