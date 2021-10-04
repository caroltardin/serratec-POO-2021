package exercicios2;

public class Program {

	public static void main(String[] args) {
		SituacaoAluno nota = new SituacaoAluno();
		CalculadoraSalario salario = new CalculadoraSalario();
		
		nota.definirSituacaoAluno();
		System.out.println("O salário líquido é " + salario.salarioLiquido());
	}

}
