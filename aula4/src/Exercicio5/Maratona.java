package Exercicio5;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected Integer idade;
	protected double altura;

	public Maratona(String nome, String sexo, Integer idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public String verificaSituacao() {
		if (this.idade >= 18 && this.altura >= 1.8)
			return "APROVADA";
		else
			return "INDEFERIDA";
	}

	@Override
	public String toString() {
		return String.format("Olá %s. Sua situacao é %s. " ,
				this.nome, verificaSituacao());
	}
}
