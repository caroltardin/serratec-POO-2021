package exercicio1;

import javax.sound.midi.SysexMessage;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario [] cadastro = new Funcionario[] {
				new Funcionario("Tadeu", "assistente", 1650.34),
				new Funcionario("Roberta", "analista", 2345.67)
		};

		cadastro[0].abonoSalario(1000);	
		cadastro[0].abonoSalario(0);
		
		System.out.println(cadastro[0]);
		System.out.println(cadastro[1]);
	}
}