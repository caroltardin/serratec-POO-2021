package exercicios4;

public class SaqueDeposito {
	
	public static void main(String[] args) {
		
		Conta c001 = new Conta("uruguai juan mendeiros", 56502, 12345, 9876.54f);
		Conta c002 = new Conta("juanita mendoza portune", 01132, 3405678, 0f);

		c001.exibirConta();
		c002.exibirConta();
	}
}