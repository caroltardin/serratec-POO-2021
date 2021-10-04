package Exercicio2;

import java.time.LocalDate;

public class MainPedido {
	
	public static void main(String[] args) {
		Pedido p1 = new Pedido(1, LocalDate.now(), 3, 45);
		Pedido p2 = new Pedido(2, LocalDate.now(), 1, 99.99);
		Pedido p3 = new Pedido(3, LocalDate.of(2021, 10, 03), 10, 20);
	
		p1.fecharPedido();
		p2.fecharPedido();
		p3.fecharPedido();
		
		System.err.println("Total de pedidos " + Pedido.totalVenda);

	}
	
}
