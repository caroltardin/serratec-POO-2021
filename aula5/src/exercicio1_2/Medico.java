package exercicio1_2;

public class Medico extends Plano{
	protected String nome;
	private Integer crm;
	
	public Medico(String empresa, String nome, Integer crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getCrm() {
		return crm;
	}

	@Override
	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() * 1.1;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s Nome do Médico: %s, CRM: %d", 
				super.toString(), this.nome, this.crm);
	}
}
