package aula_09;

public class Gerente extends Funcionario implements CalcularSalario {
	
	private float comissao;
	
	public Gerente(String nome, int cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
		
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.comissao);
	}
	
	public float calcularSalario() {
		return (this.comissao + this.getSalario());
	}
}
