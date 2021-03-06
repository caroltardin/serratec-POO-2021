package exercicio1_2;

public class Clinica extends Plano {
	private String nome;
	private String cgc;
	
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}
	
	@Override
	public String toString() {
		return String.format("%s Nome: %s  CGC: %s", 
				super.toString(), this.nome, this.cgc);
	}

}
