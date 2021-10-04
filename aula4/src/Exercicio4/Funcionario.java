package Exercicio4;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	private double remuneracao;
	protected double participacao; 
	protected double lucroLiquido2021 = 10000;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calcularParticipacao();
		
	}
	
	public double calcularParticipacao() {
		this.participacao = this.lucroLiquido2021 * 0.01;
		return participacao;
	}
	
	public double calcularRemuneracaoFinal(double adicional) {
		this.remuneracao = adicional;
		return this.remuneracao;
	} 
	
	
	@Override
	public String toString() {
		return String.format("Resumo de remunera��o do(a) %s. \nSal�rio %.2f \nParticipa��o  %.2f \nOutras remunara��es %.2f",
				this.nome, this.salario, calcularParticipacao(), this.remuneracao);
	}
}
