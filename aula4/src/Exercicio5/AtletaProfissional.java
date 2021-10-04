package Exercicio5;

public class AtletaProfissional extends Maratona{
	private double peso;

	public AtletaProfissional(String nome, String sexo, Integer idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}
	
	
}
