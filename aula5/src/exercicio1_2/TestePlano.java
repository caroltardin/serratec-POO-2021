package exercicio1_2;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Clinicando SSO Health", "Clinica de Duque de Caxias", "98776rt-09");
		Medico medico = new Medico("GS", "Alberto Leao", 33555);
		Anestesista anestesista = new Anestesista("Unimed", "Julia Fonseca", 44567, "cirurgica");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
		
		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);
		
		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);
		System.out.println(cp);

	}

}
