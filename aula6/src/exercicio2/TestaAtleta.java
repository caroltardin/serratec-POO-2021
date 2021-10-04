package exercicio2;

public class TestaAtleta {

	public static void main(String[] args) {
		Pais Brasil = new Pais("Brasil");
		Pais Espanha = new Pais("Espanha");
		
		Atleta a1 = new Atleta("Jose", 97, Brasil);
		Atleta a2 = new Atleta("Maria", 72, Brasil);
		Atleta a3 = new Atleta("Alejandro", 90, Espanha);
	
		a1.verificaSituacao();
		a2.verificaSituacao();
		a3.verificaSituacao();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(Atleta.getTotalParticipantes());

	}

}
