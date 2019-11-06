package inicio;

public class Principal {
	
	public static void inicializarClases(Clase[] vC) {
		for (int i = 0; i < vC.length; i++) {
			vC[i] = new Clase();
		}
	}

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int opcion = 0;
		//Clase clase = new Clase("Informatica", "Edificio informática");
		Clase[]vClases = new Clase[4];
		
		do {
			opcion = menu.pintaMenuPrincipal();
			switch (opcion) {
			case 1:
				vClases[0].añadirAsistente();
				break;
			case 2:
				vClases[0].eliminarAsistente();
				break;
			case 3:
				vClases[0].totalAsistentes();
				break;
			default:
				System.out.println("Adios");
				break;
			}
		}while(opcion!=4);
	}
	//

}
