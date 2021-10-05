package exercicio2;

public class Telefone {
	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Tel " + numero;
	}

	

	
}
