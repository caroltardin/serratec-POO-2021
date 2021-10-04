package Exercicio5;

public class AtletaAmador extends Maratona{
	private boolean atestado;

	public AtletaAmador(String nome, String sexo, Integer idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}
	
	
}
