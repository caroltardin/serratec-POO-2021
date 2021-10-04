package exercicios;

public class ExercicioVariaveis {
	Integer idade;
	double peso;
	double altura;
	
	public ExercicioVariaveis(Integer idade, double peso, double altura) {
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void exibirFichaDeCadastro() {
		System.out.printf("O funcionário João tem: \n idade: %d \n altura: %.2f \n peso: %.1f \n",
				this.idade, this.altura, this.peso);
		
	}
}
