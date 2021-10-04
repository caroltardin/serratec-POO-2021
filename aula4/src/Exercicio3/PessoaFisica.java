package Exercicio3;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
		calculoIR(12);
	}
	
	
	
}
