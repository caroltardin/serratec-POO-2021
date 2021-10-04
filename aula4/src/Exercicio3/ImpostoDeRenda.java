package Exercicio3;

public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;
	double IR;
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public double calculoIR(double percentualIR) { 
		this.IR = rendimentos * percentualIR/100;
		return this.IR;
	}
	
	
	public void resumoIR() {
		System.out.printf("Prezado(a), %s. \n   A partir do seu rendimento de %.2f foi calculado um Imposto de Renda no valor de %f. \nPara ajustes, alterações, atualizações ou mais informações utilizar o app da Receita Federal.",
				this.nome, this.rendimentos, this.IR);	
	}
	
	
}
