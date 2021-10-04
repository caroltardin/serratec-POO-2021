package exercicio1_2;

public class Anestesista extends Medico{
	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, Integer crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public double calcularPagamento() {
		return this.valorPago = super.calcularPagamento() + 1000;
		
	}
	
	
	@Override
	public String toString() {
		return String.format("%s, Anestesista %s",
				super.toString(), this.tipoAnestesia);
	}

}
