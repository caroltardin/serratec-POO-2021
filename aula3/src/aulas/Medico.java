package aulas;

public class Medico {
	Integer crm;
	String nome;
	double salario;
	double valorConsulta;
	public static Integer totalMedico = 0;
	
	public Medico() {
		totalMedico += 1;
	}
	
	public Medico(Integer crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		totalMedico += 1;
	}

	public double pagamentoDinheiro() {
		this.salario += this.valorConsulta;
		return this.salario;
	}
	
	public double pagamentoPlano() {
		this.salario += this.valorConsulta * 0.7;
		return this.salario;
	}
	
	
	public void resumoPorMedico() {
		System.out.printf("Dr(a) %s, CRM %d, Salário: %f",
				this.nome, this.crm, this.salario);
		
	}
	
}
