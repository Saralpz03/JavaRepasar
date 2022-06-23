package sara;

public class Alumno {
	private String nombre,apellido;
	private int edad;
	public Alumno(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Alumno nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
	}

	public static void main(String[] args) {
		mostrarAlumno();
	}
	
	public static void mostrarAlumno() {
		
		Alumno a1=new Alumno("Sara","Lopez",15);
		Alumno a2=new Alumno("Paloma","Sanchez",15);
		Alumno a3=new Alumno("David","Perez",15);
		
		System.out.println(a1+",\n"+a2+",\n"+a3);
	}
	
	
}

