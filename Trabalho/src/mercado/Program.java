package mercado;

public class Program {

	public static void main(String[] args) {
		Bebida Cerveja = new Bebida("Cerveja", 12.00, 0.05);
		Bebida Vinho = new Bebida("Vinho", 150.00, 0.12);
		Eletrodomestico TV = new Eletrodomestico("TV", 2000.00,"220");
		Eletrodomestico Geladeira = new Eletrodomestico("Geladeira", 2352.64,"Bivolt");
		Eletrodomestico Radio = new Eletrodomestico("Rádio", 837.59,"110");
		
		Cerveja.Vender(5);
		Vinho.Vender(3);
		TV.Vender(9);
		Geladeira.Vender(3);
		Radio.Vender(1);
		
		System.out.println(Cerveja);
		System.out.println(Vinho);
		System.out.println(TV);
		System.out.println(Geladeira);
		System.out.println(Radio);
		
		System.out.printf("Você comprou um total de %d itens que totalizarão R$ %.2f.",
				Produto.getQtdFinalDeItens(), Produto.getValorFinalDoPedido());
	}

}
