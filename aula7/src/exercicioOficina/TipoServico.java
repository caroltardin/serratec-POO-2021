package exercicioOficina;

public enum TipoServico {
	TROCADEOLEO(100),
	LAVAGEM(50),
	REVISAO(200);
	
	private final double valorServicos;
	
	private TipoServico(double valorServicos) {
		this.valorServicos = valorServicos;
	}

	public double getValorServicos() {
		return valorServicos;
	}
	
	
}
