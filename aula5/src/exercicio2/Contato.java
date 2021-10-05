package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Contato  {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones;

	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = new ArrayList<Telefone>();
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone telefones) {
		this.telefones.add(telefones);
	}
	
	
	public void mostrarTelefone() {
		for(Telefone t : telefones) {
			System.out.println("Telefone " + t.getNumero());	
		}
	}


	@Override
	public String toString() {
		return "Nome " + nome + endereco + "\nListagem telefônica " + telefones;
	}
	
	

}
