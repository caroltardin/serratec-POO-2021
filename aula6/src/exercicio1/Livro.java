package exercicio1;

public class Livro {
	private String autor;
	private String titulo;
	private double valor;
	
	public Livro(String autor, String titulo, double valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}

	
	public void reajuste(double percentualReajuste) {
		this.valor += this.valor * (percentualReajuste/100);
	}
	
	@Override
	public String toString() {
		return String.format("Autor: %s   Titulo: %s",
				this.autor, this.titulo);
				
	}

}
