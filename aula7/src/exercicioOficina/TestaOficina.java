package exercicioOficina;

import java.time.LocalDate;

public class TestaOficina {

	public static void main(String[] args) {
		Proprietario CJ =  new Proprietario("Cristina Joccob");
		Carro carro = new Carro("X1", LocalDate.of(2021, 10, 02), CJ, "AWD");
		Moto moto = new Moto("1", LocalDate.now(), CJ, 400);

		carro.lavarVeiculo();
		carro.revisao();
		carro.trocarOleo();
		
		moto.lavarVeiculo();
		moto.revisao();
		
		
	
		System.out.println(carro);
		System.out.println(moto);
	}

}
