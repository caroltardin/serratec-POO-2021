package Exercicio3;

public class TestaIR {

	public static void main(String[] args) {

	PessoaFisica pf1 = new PessoaFisica("Carlos Moraes", 150000, "765.876.890-00", "7899877DIC");
	PessoaJuridica pj1 = new PessoaJuridica("Empreendimentos Tecnologicos Ltda", 1098066.34, "12.456.777/0009-8", "RJ78o9");
	
	pf1.resumoIR();
	pj1.resumoIR();
	
}
}
