package exercicio2;

public class Pais {
	private String name;
	
	public Pais (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Pa�s: " + this.name;
	}
	
}
