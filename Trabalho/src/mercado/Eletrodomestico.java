package mercado;

public class Eletrodomestico extends Produto {
	private String voltagem;

	public Eletrodomestico(String nome, double valor, String voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String toString() {
		return super.toString() + "Obs Voltagem " + voltagem;
	}

	
	
}
