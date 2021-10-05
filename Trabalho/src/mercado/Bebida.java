package mercado;

public class Bebida extends Produto {
	private double teorAlcoolico;

	public Bebida(String nome, double valor, double teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
	}

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
	
	public String toString() {
		return String.format("%s Obs Teor Alcoolico: %.2f",
				super.toString(), this.teorAlcoolico);
	}


}
