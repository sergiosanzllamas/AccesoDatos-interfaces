package centro;

public class Profesor {
	String dni;
	String nombre;
	String apellidos;
	double salario;
	int numasignat;
	boolean tutor;
	public Profesor(String dni, String nombre, String apellidos, double salario, int numasignat, boolean tutor) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.numasignat = numasignat;
		this.tutor = tutor;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumasignat() {
		return numasignat;
	}
	public void setNumasignat(int numasignat) {
		this.numasignat = numasignat;
	}
	public boolean isTutor() {
		return tutor;
	}
	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", numasignat=" + numasignat + ", tutor=" + tutor + "]";
	}
	
}
