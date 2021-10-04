package Exercicio2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private Integer numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	public static Integer totalVenda = 0;

	public Pedido(Integer numero, LocalDate dataPedido, double quantidade, double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		Pedido.totalVenda += 1;
	}

	public Integer getNumero() {
		return numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	
	public void fecharPedido() {
		double totalPedido = 0;
		
		if(this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY))
			totalPedido = (this.valor * this.quantidade) * 0.9;
		else
			totalPedido = this.valor * this.quantidade;
	
		System.out.println("\nSeu pedido foi relizado com sucesso. O valor total é de " + totalPedido);
			
	}

}
