package aula_exceptions;

public class TestaExcecaoSimples {

	public static void main(String[] args) throws ExcecaoSimples {
		String nomes[] = { "Jo�o", "Maria", "Pedro", "Manuela" };

		try {
			for (int i = 0; i < nomes.length; i++) {
				System.out.println(nomes[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\nExce��o: " + e);
			System.out.println("\nPosi��o Inv�lida");
		}
		
		throw new ExcecaoSimples("Excecao Simples");
		
	}


	}


