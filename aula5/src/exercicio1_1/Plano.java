package exercicio1_1;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorISS = 5;
	
	public Plano(String empresa) {
		this.empresa = empresa;
	}

	
	public double getValorPago() {
		return valorPago;
	}

	
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}


	public double calcularPagamento() {
		
		return this.valorPago -= (this.valorPago * (this.valorISS/100)); 
	}
	
	
			
	@Override
	public String toString() {
		return String.format("Empresa %s  Valor total Pago %.2f", this.empresa, this.valorPago);
	}
}
