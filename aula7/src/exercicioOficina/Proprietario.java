package exercicioOficina;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		this.nome = nome;
	}
	
		
	public String getNome() {
		return nome;
	}


	@Override
	public String toString() {
		return String.format("Nome do proprietário " + this.nome);
	}

}
