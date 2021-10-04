package exercicios2;

public class SituacaoAluno {
	double nota1 = 7;
	double nota2 = 8;
	double media = (nota1 + nota2) / 2;

	public void definirSituacaoAluno() {
		if (media >= 7 && media < 10)
			System.out.println("Aprovado");
		else if (media == 10)
			System.out.println("Aprovado. Parabéns!");
		else
			System.out.println("Reprovado");
	}
}
