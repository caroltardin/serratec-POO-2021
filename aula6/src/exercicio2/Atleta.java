package exercicio2;

public class Atleta implements Olimpiada{
	private String nome;
	private double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais; 
	
	 
	public Atleta(String nome, double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		totalParticipantes += 1;
	}
	

	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public String getNome() {
		return nome;
	}



	public double getPeso() {
		return peso;
	}



	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s \n Peso: %f \n Modalidade: %s \n %s \n", 
				this.nome, this.peso, this.modalidade, this.pais);
	}


	@Override
	public String verificaSituacao() {
		if(this.peso > 90) {
			setModalidade("peso pesado");
			return "participará";
		}
		else if(this.peso <= 90 && this.peso >= 60){
			setModalidade("peso médio");
			return "participará";
		}
		else
			return "não participará";
	}

}