package exercicio2;

public class Cidade {
	private String cidade;
	private Estado estado;

	public Cidade(String cidade, Estado estado) {
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	
	@Override
	public String toString() {
		return "\nCidade " + this.cidade + this.estado;
	}
}
