package exercicios3;

public class Contagens {

	
	public void paresImpares() {
		Integer par = 0;
		Integer impar = 0;

		for (Integer i = 1; i < 31; i++) {
			if (i % 2 == 0)
				par += 1;
			else
				impar += 1;
		}

		System.out.println("Números PARES: " + par);
		System.out.println("Números ÍMPARES: " + impar);

	}

	public void multiplos2() {
		for (Integer i = 1; i < 23; i++) {
			if (i % 2 == 0)
				System.out.println(i + " Java");
		}

	}

	public void tabuada2() {
		for (Integer i = 1; i < 11; i++) {
			Integer resultado = i * 2;

			System.out.println("2 x " + i + " = " + resultado);

		}
	}

	public void fatoriais() {

		for (Integer i = 1, fatorial = 1; i < 11; i++) {
			fatorial = fatorial * i;
			System.out.println("Resultado do fatorial de " + i + " é " + fatorial);
		}

	}

}
