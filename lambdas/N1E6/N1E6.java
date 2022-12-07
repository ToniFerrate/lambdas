package lambdas.N1E6;

import java.util.ArrayList;
import java.util.List;

// Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de 
// més curta a més llarga.

public class N1E6 {

	public static void main(String[] args) {
		List<String> llista = new ArrayList<String>();
		llista.add("Toni");
		llista.add("Cristina");
		llista.add("23Jordi");
		llista.add("Xavi");
		llista.add("44Berta");
		llista.add("Ramona");
		llista.add("Peronella");
		llista.add("Mireia");
		
		List<String> llista2 = retornaArrayOrdenat(llista);
		for(String nom:llista2) {	
			System.out.println(nom);
		}
		
	}
	public static List<String> retornaArrayOrdenat(List<String> llista){
		return llista.stream()
				.sorted((a, b)->Integer.compare(a.length(), b.length()))
				.toList();
	}
}
