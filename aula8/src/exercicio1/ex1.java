package exercicio1;

public class ex1 {

	public static void main(String[] args) {
		int[] numerador = {1,2,3,4,5};
		int[] denominador = {3,0,2};
		
		for(int i=0; i < numerador.length;i++) {
			System.out.printf("Dividindo %d / %d = %.2f",
					numerador[i], denominador[i], (double) numerador[i]/denominador[i]);
			}
	}
}
