package exercicio1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		try {
			System.out.println("Insira um número ");
			ex3.lerNumero();
			System.out.println("Obrigada");
		} catch (Exception nInt) {
			System.out.println("Falha ao ler o número");
		}
	}

	
	public static double lerNumero() throws Exception{
		Scanner ler = new Scanner(System.in);
		double numeroInteiro = ler.nextDouble();
		ler.close();
		return numeroInteiro;
		
	}

}
