package exercicios;

public class Imovel {
	Integer codImovel;
	String bairro;
	String tipo;
	double valor;
	String categoria;

	public Imovel(Integer codImovel, String bairro, String tipo, double valor) {
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
		calcularReajuste();
		categorizar();

	}

	public void calcularReajuste() {
		if (this.tipo == "casa")
			this.valor += this.valor * 0.05;
		if (this.tipo == "apto")
			this.valor += this.valor * 0.08;
	}

	public void categorizar() {

		if (this.valor > 50000)
			this.categoria = "Categoria A";
		else if (this.valor >= 10000 && this.valor >= 50000)
			this.categoria = "Categoria B";
		else
			this.categoria = "Categoria C";

	}

	public void mostrarResumo() {
		System.out.printf("O/A %s %d, localizado no bairro %s, caterogia %s, teve seu valor reajustado para US$ %.2f\n",
				this.tipo, this.codImovel, this.bairro, this.categoria, this.valor);
	}
}