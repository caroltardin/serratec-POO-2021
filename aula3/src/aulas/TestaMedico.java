package aulas;

public class TestaMedico {

	public static void main(String[] args) {
		Medico m12345 = new Medico(12345, "Ana Maria", 0, 250);
		Medico m456789 = new Medico(456789, "Antônio", 0, 300);
	
		m12345.pagamentoDinheiro();
		m12345.pagamentoPlano();
		m12345.resumoPorMedico();
		
		m456789.pagamentoDinheiro();
		m456789.pagamentoPlano();
		m456789.resumoPorMedico();
		
		System.out.println("\nTotal de médico(s): " + Medico.totalMedico);
		
	}

}
