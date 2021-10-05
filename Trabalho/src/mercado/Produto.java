package mercado;

public abstract class Produto implements Venda {
	private String nome;
	private double valor;
	private int quantidadeDeItens;
	private double vendaTotalPorItem = 0;
	private static double valorFinalDoPedido = 0;
	private static Integer qtdFinalDeItens = 0;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.vendaTotalPorItem += 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVendaTotal() {
		return this.vendaTotalPorItem;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public double getVendaTotalPorItem() {
		return vendaTotalPorItem;
	}

	public static double getValorFinalDoPedido() {
		return valorFinalDoPedido;
	}
	
	public static Integer getQtdFinalDeItens() {
		return qtdFinalDeItens;
	}



	@Override
	public double Vender(int quantidadeDeItens) {
		this.vendaTotalPorItem = quantidadeDeItens * this.valor;
		Produto.valorFinalDoPedido += this.vendaTotalPorItem;
		Produto.qtdFinalDeItens += quantidadeDeItens;
		return this.vendaTotalPorItem;
	}

	@Override
	public String toString() {
		return String.format("Produto: %s, Unidade(s): %d, Valor Unitário: %.2f ---Valor Total do Item: %.2f--- ",
				 this.nome, this.quantidadeDeItens, this.valor, this.vendaTotalPorItem);
	}

}
