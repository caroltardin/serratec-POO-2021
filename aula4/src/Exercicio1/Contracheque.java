package Exercicio1;

public class Contracheque {

	public void Executar() {
		DemonstrarCapacidade();
	}
		
	public void DemonstrarCapacidade() {
		Empregado emp1 = new Empregado("Jose", "Silva", 1500);
		Empregado emp2 = new Empregado("Maria", "Oliveira", 2912.87);
		Empregado emp3 = new Empregado("Maria", "Oliveira", 6000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
	

}
