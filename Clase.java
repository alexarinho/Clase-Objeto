package inicio;

public class Clase {
	
	private String nombre;
	private int capacidad;
	private String ubicacion;
	private int asistentes;
	
	public Clase() {
		nombre = "";
		capacidad = 20;
		ubicacion = "";
		asistentes = 0;
	}
	
	public Clase(String nombre, String ubicacion) {
		this.nombre = nombre;
		capacidad = 20;
		this.ubicacion = ubicacion;
		asistentes = 0;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public int getAsistentes() {
		return this.asistentes;
	}
	
	public void añadirAsistente() {
		if(asistentes<=this.capacidad) {
			this.asistentes++;
		}
	}
	
	public void eliminarAsistente() {
		if(asistentes>=1) {
			this.asistentes--;
		}
	}
	
	public int totalAsistentes() {
		return this.asistentes;
	}
	
	public String toString() {
		return nombre + " " ;
	}
}
