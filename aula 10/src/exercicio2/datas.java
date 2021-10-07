package exercicio2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class datas {

	public static void main(String[] args) {
		LocalDateTime meuAniversario = LocalDateTime.of(1996, 03, 13, 21, 00, 00);
		LocalDateTime hoje = LocalDateTime.now();

		DateTimeFormatter dataFomartada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		System.out.println("Meu aniversário " + meuAniversario.format(dataFomartada) + " Hoje " + hoje.format(dataFomartada));
		System.out.println("Nasci em ano bisexto? " + meuAniversario.toLocalDate().isLeapYear());
		
		Duration tempoVida = Duration.between(meuAniversario, hoje);		
		System.out.println("Segundos de vida  " + tempoVida.getSeconds());
		System.out.println("Dias fora da barriga " + ChronoUnit.DAYS.between(meuAniversario, hoje));		
		

	}

}
