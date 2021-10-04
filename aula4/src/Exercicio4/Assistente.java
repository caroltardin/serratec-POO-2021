package Exercicio4;

public class Assistente extends Gerente {
	private double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
		calcularRemuneracaoFinal(this.adicional);
	}
	
	

}
