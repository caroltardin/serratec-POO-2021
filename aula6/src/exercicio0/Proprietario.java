package exercicio0;

public class Proprietario extends Imovel {
	private String nome;

	public Proprietario(String local, double valorImovel, String nome) {
		super(local, valorImovel);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
