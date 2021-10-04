package exercicios4;

public class Conta {
	String nomeCompleto;
	Integer numeroAgencia;
	Integer numeroConta;
	Float saldo;

	public Conta(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;

	}

	public Conta(String nomeCompleto, Integer numeroAgencia, Integer numeroConta, Float saldo) {
		this.nomeCompleto = nomeCompleto;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void exibirConta() {
		System.out.printf("Olá, %s. \n O saldo da sua conta %d da agência %d é de R$ %.2f.\n",
				this.nomeCompleto, this.numeroAgencia, this.numeroConta, this.saldo);
	}

}
