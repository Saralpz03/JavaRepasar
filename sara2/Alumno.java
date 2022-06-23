package sara2;

public class Alumno {
	//atributos
	private String nombre;

	//constructor
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	//metodos
	@Override
	public String toString() {
		return "Alumno nombre=" + nombre;
	}
	
	
}
