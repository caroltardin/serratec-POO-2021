package exercicio0;

public class Apto extends Imovel {
	private Integer andar;

	public Apto(String local, double valorImovel, Integer andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	
	public Integer getAndar() {
		return andar;
	}
	

}
