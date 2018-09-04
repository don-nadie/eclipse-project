package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hola mundo!");
		System.out.print("Tu nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("fuck you, " + nombre + "!!");
		
		entrada.close();
	}

}
