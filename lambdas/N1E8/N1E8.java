package lambdas.N1E8;

/*
Crea una Functional Interface que contenga un método llamado reverse(). 
Este método debe recibir y debe devolver un String. En el main() de la clase principal, inyecta 
a la interfaz creada mediante una lambda, el cuerpo del método, de modo que devuelva la misma 
cadena que recibe como parámetro pero al revés. Invoca la instancia de la interfaz pasándole una 
cadena y comprueba si el resultado es correcto.
*/
public class N1E8 {

	public static void main(String[] args) {
		
		Calcul func = s -> new StringBuilder(s).reverse().toString();

		System.out.println(func.reverse("Toni Ferrate"));
	}

}
