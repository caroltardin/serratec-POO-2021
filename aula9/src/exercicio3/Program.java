package exercicio3;

public class Program {

	public static void main(String[] args) throws AlunoException {
			Aluno[] listaAlunos= new Aluno[] {
					new Aluno("Rafael", 7.5, 8),
					new Aluno("Rafael", 7.5, 8),
			};
			
			
			try {
				double media = listaAlunos[0].calcularMedia();
				System.out.println("Sua média é " + media);

			}catch(AlunoException e) {
				throw new AlunoException("Nota inválida, valor maior que 10 ou igual a zero.");
			}
			
			
				/*	Implementar loop 
				  	listaAlunos[0].calcularMedia();
					listaAlunos[1].calcularMedia();
					
					System.out.println(listaAlunos[0]);
					System.out.println(listaAlunos[1]);
				*/	
				
	}

}
