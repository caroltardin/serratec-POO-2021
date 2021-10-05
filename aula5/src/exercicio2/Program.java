package exercicio2;

public class Program {
	public static void main(String[] args) {
		Estado sp = new Estado("São Paulo", "SP");
		Estado rj = new Estado("Rio de Janiero", "RJ");
		
		Cidade nf = new Cidade("Nova Friburgo", rj);
		Cidade gua = new Cidade("Guarulhos", sp);
		
		Endereco end1 = new Endereco("Rua A", "Centro", "286330-00", nf);
		Endereco end2 = new Endereco("Rua B", "Vila Augusta", "00890-12", gua);
	
		Contato lara = new Contato("Lara", end1);
		Contato ana = new Contato("Ana",end2);
			
		
		Telefone l1 = new Telefone("0001");
		Telefone l2 = new Telefone("0002");
		Telefone l3 = new Telefone("0003");
		Telefone a1 = new Telefone("0004");
		Telefone a2 = new Telefone("0005");
	
		
		lara.setTelefones(l1);
		lara.setTelefones(l2);
		lara.setTelefones(l3);
		ana.setTelefones(a1);
		ana.setTelefones(a2);
	
		
		System.out.println(lara);
		System.out.println(ana);

		
	}


}
