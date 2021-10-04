package exercicio1;

public class TestaLivro {

	public static void main(String[] args) {
		Livro livroMA = new Livro("Marco Ant�nio", "Cisco CCNA", 85);	
		Livro livroKS = new Livro("Kathy Sierra", "Use a cabe�a Java", 98);
		
		Operacao op1 = new Operacao("venda", livroMA);
		Operacao op2 = new Operacao("emprestimo", livroKS);
		
		livroMA.reajuste(6);
		
		op1.venderLivro();
		op2.emprestarLivro();
		
		System.out.println(op1);
		System.out.println(op2);
		
		
	}

}
