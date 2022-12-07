package lambdas.N1E2;

import java.util.ArrayList;
import java.util.List;

/*
Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els 
Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
*/
public class N1E2 {
	public static void main(String[] args) {
		List<String> llista = new ArrayList<String>();
		llista.add("Toni");
		llista.add("Cristina");
		llista.add("Jordi");
		llista.add("Xavi");
		llista.add("Berta");
		llista.add("Ramona");
		llista.add("Peronella");
		llista.add("Mireia");
		
		List<String> llista2 = retornaArrayAmbOMes5lletres(llista);
		for(String nom:llista2) {	
			System.out.println(nom);
		}
	}
	
	public static List<String> retornaArrayAmbOMes5lletres(List<String> llista){
		return llista.stream()
				.filter(x -> x.contains("o"))
				.filter(x -> x.length() > 5)
				.toList();
	}
}
