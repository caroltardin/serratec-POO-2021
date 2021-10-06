package exercicio1;

public class Funcionario {
	private String name;
	private String cargo;
	private double salario;
	
	public Funcionario(String name, String cargo, double salario) {
		this.name = name;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public double abonoSalario(double abono){
		return this.salario += abono;
		
	}
	
	@Override
	public String toString() {
		return String.format("O salário final é %.2f",
				this.salario);
	}
}
