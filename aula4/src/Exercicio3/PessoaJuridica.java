package Exercicio3;

public class PessoaJuridica extends ImpostoDeRenda{
	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		calculoIR(15);
	}
	
	
	
}
