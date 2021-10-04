package Exercicio1;

public class Empregado {	
	private String nome;
	private String sobrenome;
	private double salario;
	
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
	public double calculaImpostoRenda() {
		double IR = 0;
		if(salario >= 1903.98 && salario < 2826.66)
			IR = salario *  0.075;
		else if(salario >= 2826.66 && salario < 3751.06)
			IR = salario *  0.15;
		else if(salario >= 3751.06 && salario <= 4664.68)
			IR = salario *  0.225;
		else if(salario > 4664.68)
			IR = salario *  0.275;
		
		return IR;
	}
	
	public double calcularSalarioLiquido() {
		double salarioLiquido = this.salario - calculaImpostoRenda(); 
		return salarioLiquido;
	}
	
	@Override
	public String toString() {
		return String.format("\n  CONTRACHEQUE\n%s %s \nSalario Bruto %.2f \nINNS %.2f \nSalario Líquido %.2f", 
				this.nome, this.sobrenome, this.salario, calculaImpostoRenda(), calcularSalarioLiquido());
	}
}
