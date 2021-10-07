package exercicio1;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		
		Map<String, String[]> carros = new HashMap<String, String[]>();
		
		carros.put("honda", new String [] {"civic", "HRV"});
		carros.put("fiat",  new String [] {"uno"});
		carros.put("toyota",  new String [] {"corolla", "prius", "hilux"});
		
			for (String chave : carros.keySet()) {
				String[] valores = carros.get(chave);
				String valoresConcatenados = String.join(" - ", valores);
				
				System.out.printf("Marca %s , Modelos %s ", chave, valoresConcatenados);		
			}
	}
}
