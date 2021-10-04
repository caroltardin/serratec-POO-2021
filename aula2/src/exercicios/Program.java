package exercicios;

public class Program {

	public static void main(String[] args) {
		ExercicioVariaveis joao = new ExercicioVariaveis(20, 52.5, 1.75);	
		CalculadoraMedia calcular = new CalculadoraMedia();
		
		joao.exibirFichaDeCadastro();
		System.out.println("A média é:" + calcular.calcularMedia());
		
	
	}

}
