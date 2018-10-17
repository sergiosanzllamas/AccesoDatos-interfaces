package centro;

public class Administracion {
	String dni;
	String nombre;
	String apellidos;
	double salario;
	char sexo;
	int numhorext;
	//
	public Administracion(String dni, String nombre, String apellidos, double salario, char sexo, int numhorext) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.sexo = sexo;
		this.numhorext = numhorext;
	}
	//
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getNumhorext() {
		return numhorext;
	}
	public void setNumhorext(int numhorext) {
		this.numhorext = numhorext;
	}
	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", sexo=" + sexo + ", numhorext=" + numhorext + "]";
	}
	
}
