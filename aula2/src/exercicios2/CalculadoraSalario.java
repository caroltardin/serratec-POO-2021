package exercicios2;

public class CalculadoraSalario {
	double salario = 2456.78;

	public double calcularINSS() {
		double INSS;
	if(salario <= 1751.81)
		 INSS = salario * 0.08;
	else if(salario > 1751.81 && salario <= 2919.72)
		 INSS = salario * 0.09;
	else if(salario > 2919.72 && salario <= 5839.45)
		 INSS = salario * 0.10;
	else
		 INSS = salario * 0.11;
	
	return INSS;
	}
	
	public double salarioLiquido() {
		return this.salario - calcularINSS();
		
	}
}
