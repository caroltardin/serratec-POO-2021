package exercicio1;

public class Operacao implements Livraria{
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	
	public void emprestarLivro() {
		this.valorOperacao = (this.livro.getValor() * 0.02) + Livraria.taxaEmprestimo;
	}

	public void venderLivro() {
		this.valorOperacao = this.livro.getValor() + (this.livro.getValor() * 0.09);
		
	}

	@Override
	public String toString() {
		return String.format("Tipo: %s  Valor: %.2f  %s",
				this.tipo, this.valorOperacao, this.livro.toString());

	}
	
	

}
