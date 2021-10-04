package exercicioOficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	
	@Override
	public String toString() {
		return String.format("%s \nData do serviço %s \nModelo %s \nValor total dos serviços %.2f \n", 
				proprietario, this.dataConserto, this.modelo, this.valorCobrado);
	}

	
	public double getvalorCobrado() {
		return valorCobrado;
	}
}
