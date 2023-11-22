package aula_09;

public class Vendedor extends Funcionario implements CalcularSalario {
	public float bonus;
	
	public Vendedor(String nome, int cargo, float salario, float bonus) {
		super(nome, cargo, salario);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Bônus: " + this.bonus);
	}
	
	@Override
	public float calcularSalario() {
		return (this.bonus*this.getSalario() + this.getSalario());
	}
	
}
