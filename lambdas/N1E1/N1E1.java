package lambdas.N1E1;

import java.util.ArrayList;
import java.util.List;

/*
A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes 
que contenen la lletra ‘o’. Imprimeix el resultat.
*/
public class N1E1 {
	public static void main(String[] args) {
		List<String> llista = new ArrayList<String>();
		llista.add("Toni");
		llista.add("Cristina");
		llista.add("Jordi");
		llista.add("Xavi");
		llista.add("Berta");
		
		List<String> llista2 = retornaArrayAmbO(llista);
		for(String nom:llista2) {	
			System.out.println(nom);
		}
	}
	
	public static List<String> retornaArrayAmbO(List<String> llista){
		return llista.stream().filter(x -> x.contains("o")).toList();
	}
}
