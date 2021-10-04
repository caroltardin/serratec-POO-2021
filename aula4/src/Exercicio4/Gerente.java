package Exercicio4;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularParticipacao() {
		super.calcularParticipacao();
		super.participacao += 200;
		return participacao;

	}
	

}
