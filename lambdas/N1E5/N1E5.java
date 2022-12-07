package lambdas.N1E5;
/*
Crea una Functional Interface con un método llamado getPiValue() que debe devolver un double. 
Desde el main() de la clase principal, instancia la interfaz y asíñale el valor 3.1415. 
Invoca el método getPiValue() e imprime el resultado.
*/
public class N1E5 {

	public static void main(String[] args) {
		Calcul calc = () -> 3.1415;
		System.out.println(calc.getPiValue());

	}

}
