package exercicio0;

public class Program {

	public static void main(String[] args) {
		Imovel casa = new Casa("Solares", 100000, false);
		Imovel apto = new Apto("Braunes", 250000, 6);
		
		System.out.println(casa);
		System.out.println(apto);
	}

}
