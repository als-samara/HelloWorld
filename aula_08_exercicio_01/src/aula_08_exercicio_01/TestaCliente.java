package aula_08_exercicio_01;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente samara = new Cliente("Samara Almeida", 001, 1, "São Paulo");
		Cliente luiza = new Cliente("Luiza", 002, 1, "União Soviética");
		
		samara.visualizar();
		luiza.visualizar();

	}

}
