package exercicio3;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private Double media;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}
	
	

	public double calcularMedia() throws AlunoException {
			if(this.nota1 > 10 || this.nota2 > 10 || this.nota1 <= 0 || this.nota2 <= 0) {
				throw new AlunoException("Nota inválida");
			}
		double media = (this.nota1 + this.nota2)/2;	
		return media;
	}
	
	/* IMPLEMENTAR LOOP NA MAIN
	public double calcularMedia() throws AlunoException {
		if(this.nota1 != 0 || this.nota2 != 0 || this.nota1 <= 10 || this.nota2 <= 10 || this.nota1 >= 0 || this.nota2 >= 10) {
			return this.media = (this.nota1 + this.nota2)/2;	
				 
			}else
				throw new AlunoException("Nota inválida, valor maior que 10.");
	}
	
	@Override
	public String toString() {
		return String.format("Sua média é %.2f", this.media);
	}
	*/

}