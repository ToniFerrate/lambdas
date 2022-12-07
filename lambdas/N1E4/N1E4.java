package lambdas.N1E4;

import java.util.ArrayList;
import java.util.List;

/*
Fer la mateixa impressió del punt anterior, però mitjançant method reference. 
*/
public class N1E4 {
	public static void main(String[] args) {
		List<String> llista = new ArrayList<String>();
		llista.add("Gener");
		llista.add("Febrer");
		llista.add("Març");
		llista.add("Abril");
		llista.add("Maig");
		llista.add("Juny");
		llista.add("Juliol");
		llista.add("Agost");
		llista.add("Setembre");
		llista.add("Octubre");
		llista.add("Novembre");
		llista.add("Desembre");
		
		llista.stream().forEach(System.out::println);
		
	}
}
