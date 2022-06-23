package sara3;

public class Alumno {
	private String nombre,trabajo;
	private int edad;
	public Alumno(String nombre, String trabajo, int edad) {
		super();
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", trabajo=" + trabajo + ", edad=" + edad + "]";
	}
	
	public String mostrarNombre() {
		return "Nombre: "+nombre;
	}
}
