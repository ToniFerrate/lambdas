package lambdas.N1E3;

import java.util.ArrayList;
import java.util.List;

/*
Crea una llista amb els noms dels mesos de l’any. 
Imprimeix tots els elements de la llista amb una lambda.
*/
public class N1E3 {
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
		
		llista.stream().forEach(x -> System.out.println(x));
		
	}
}
