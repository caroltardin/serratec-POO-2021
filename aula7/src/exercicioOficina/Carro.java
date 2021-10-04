package exercicioOficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorServicos();
		return valorCobrado;	
	}

	@Override 
	public double trocarOleo() {
		if(this.dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY))
			super.valorCobrado += TipoServico.TROCADEOLEO.getValorServicos() - 50;
		else 
			super.valorCobrado += TipoServico.TROCADEOLEO.getValorServicos();
		return super.valorCobrado;	
	}

	@Override 
	public double revisao() {
		if(this.dataConserto.getMonth().equals(Month.AUGUST))
			super.valorCobrado += TipoServico.REVISAO.getValorServicos() * 0.9;
		else
			super.valorCobrado += TipoServico.REVISAO.getValorServicos();
		return super.valorCobrado;

		}

	@Override
	public String toString() {
		
		return super.toString() + "Serviço realizado nCategoria: " + this.categoria;
	}

}
