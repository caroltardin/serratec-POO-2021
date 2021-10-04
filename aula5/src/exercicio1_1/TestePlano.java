package exercicio1_1;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Clinicando SSO Health", "Clinica de Duque de Caxias", "98776rt-09");
		Medico medico = new Medico("GS", "Alberto Leao", 33555);
		Anestesista anestesista = new Anestesista("Unimed", "Julia Fonseca", 44567, "cirurgica");
		
		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();
			
		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);

	}

}
