package inicio;

import java.util.Scanner;

public class Menu {

	public Menu(){
		
	}
	
	public int pintaMenuPrincipal() {
		
		int opcion=0;
		
		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("1. Añadir asistentes");
			System.out.println("2. Borrar asistentes");
			System.out.println("3. Ver asistentes");
			System.out.println("4. Salir");
			opcion = leer.nextInt();
			System.out.println("----------------------");
		}while(opcion<1 || opcion>4);
		
		return opcion;
	}
}
