package centro;

public class Directivo {
	String dni;
	String nombre;
	String apellidos;
	double salario;
	boolean salesiano;
	char turno;
	public Directivo(String dni, String nombre, String apellidos, double salario, boolean salesiano, char turno) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
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
	public boolean isSalesiano() {
		return salesiano;
	}
	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", salesiano=" + salesiano + ", turno=" + turno + "]";
	}
	
}
