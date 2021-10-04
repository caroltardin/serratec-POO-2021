package exercicioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		super.valorCobrado += TipoServico.LAVAGEM.getValorServicos();
		return super.valorCobrado;
	}

	@Override
	public double trocarOleo() {
		valorCobrado += TipoServico.TROCADEOLEO.getValorServicos();
		return super.valorCobrado;
	}

	@Override
	public double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorServicos();
		return super.valorCobrado;
	}

	@Override
	public String toString() {

		return super.toString() + "Serviço realizado na cilindradas: " + this.cilindradas;
	}

}
