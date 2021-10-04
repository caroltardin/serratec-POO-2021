package exercicios;

public class MainImovel {

	public static void main(String[] args) {
		Imovel apto1 = new Imovel(1, "Centro", "apto", 25000);
		Imovel casa2 = new Imovel(2, "Quintadinha", "casa", 98900);
		
		apto1.mostrarResumo();
		casa2.mostrarResumo();
	}

}
