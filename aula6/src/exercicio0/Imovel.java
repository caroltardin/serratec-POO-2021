package exercicio0;

public class Imovel {
	protected String local;
	private double valorImovel;
	
	public Imovel(String local, double valorImovel) {
		this.local = local;
		this.valorImovel = valorImovel;
	}

	
	public double calculaImpostoVenda(){
		double valorITBI = this.valorImovel* 0.035;
		return valorITBI;
			
	}
	
	
	@Override
	public String toString() {
		return String.format("Seu imovel localizado em %s no valor de R$ %.2f tem o ITBI no valor total de R$ %.2f", 
				this.local, this.valorImovel, calculaImpostoVenda());
	}
	
	
	
	

}
