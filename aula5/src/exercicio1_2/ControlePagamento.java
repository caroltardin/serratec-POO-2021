package exercicio1_2;

public class ControlePagamento {
	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}

	public void calcularTotalPago(Plano plano) {
		totalPago += plano.getValorPago();
	}

	@Override
	public String toString() {
		return String.format("Total de pagamentos realizados pelo plano %.2f", +totalPago);
	}

}
