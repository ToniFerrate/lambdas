package lambdas.N1E7;

import java.util.ArrayList;
import java.util.List;

// Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

public class N1E7 {

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
				.sorted((a, b)->Integer.compare(b.length(), a.length()))
				.toList();
	}
}
