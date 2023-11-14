package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exe05 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int opcao = 1;
		String nome;

		while (opcao != 0) {
			System.out.println("Digite a opção desejada: " + "\n1 - Adicionar cliente na fila"
					+ "\n2 - Listar todos os clientes" + "\n3 - Retirar cliente da fila" + "\n0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Fila: " + fila + "\nCliente Adicionado!\n");
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!\n");
				} else {
					System.out.println("Lista de clientes na fila: " + fila + "\n");
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!\n");
				} else {
					String cliente = fila.remove();
					System.out.println("Fila\n" + fila + "\nO(a) cliente " + cliente + " foi chamado(a)!\n");
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
