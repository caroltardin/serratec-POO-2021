package exercicio0;

public class Casa extends Imovel {
	private boolean garagem;

	public Casa(String local, double valorImovel, boolean garagem) {
		super(local, valorImovel);
		this.garagem = garagem;
	}
	
}
