package exercicios;

import java.util.Scanner;

public class Calculadora {
	Scanner ler = new Scanner(System.in);

	public double somar(double valor1, double valor2) {
		double resultado = valor1 + valor2;
		return resultado;
	}

	public double subtrair(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}

	public double dividir(double valor1, double valor2) {
		double resultado = valor1 / valor2;
		return resultado;
	}

	public void executar() {
		int opcaoCalculo;
		
		do {
			System.out.println("Vamos calcular? " + "\n 1 Soma \n 2 Subtracao \n 3 Multiplica��o \n 4 Divisa�o \n 5 Sair");
			System.out.println("Insira o n�mero da op��o desejada abaixo");
			opcaoCalculo = ler.nextInt();
			
			if(opcaoCalculo < 5) {
			System.out.println("Insira o primeiro valor ");
			double num1 = ler.nextDouble();
			
			System.out.println("Insira o segundo valor ");
			double num2 = ler.nextDouble();
			
			
			double resultado = 0;
				
				if (opcaoCalculo == 1)
					resultado = somar(num1, num2);
	
				else if (opcaoCalculo == 2)
					resultado = subtrair(num1, num2);
	
				else if (opcaoCalculo == 3)
					resultado = multiplicar(num1, num2);
	
				else if (opcaoCalculo == 4)
					resultado = dividir(num1, num2);
			
			System.out.println("O resultado � " + resultado);
			}
			else if(opcaoCalculo > 5)
				System.out.println("Op��o inv�lida");
			
		}while(opcaoCalculo != 5);

		System.out.println("Programa encerrado.");
	}
}
