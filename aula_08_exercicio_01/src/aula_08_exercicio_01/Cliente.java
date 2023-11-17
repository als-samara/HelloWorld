package aula_08_exercicio_01;

public class Cliente {
	private String nome;
	private int codigo;
	private int sexo;
	private String localidade;
	
	public Cliente(String nome, int codigo, int sexo, String localidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.sexo = sexo;
		this.localidade = localidade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public void visualizar() {
		String sexo = "";
		
		switch(this.sexo) {
		case 1 -> sexo = "Feminino";
		case 2 -> sexo = "Masculino";
		}
		
		System.out.println("\n*******************************");
		System.out.println("\nNome do Cliente: " + this.nome);
		System.out.println("\nCódigo do Cliente: " + this.codigo);
		System.out.println("\nSexo do Cliente: " + sexo);
		System.out.println("\nLocalidade do Cliente: " + this.localidade);
	}
}
