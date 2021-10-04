package outros;
import java.util.Scanner;

public class ExercicioEntrada {
	public void entradaSoma() {
		Scanner ler = new Scanner(System.in);
		int a, b;
		
		System.out.println("Informe o primeiro valor: ");
		a = ler.nextInt();
				
		System.out.println("Informe o segundo valor: ");
		b = ler.nextInt();
		
		System.out.println("\n Resultado da soma:\n");
		System.out.println(a+b);
		
		ler.close();
	}

}
