package ejercicio7;

public class Persona {
	String dni;
	String nomap;
	double salario;

	public Persona(String dni, String nomap, double salario) {
		super();
		this.dni = dni;
		this.nomap = nomap;
		this.salario = salario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomap() {
		return nomap;
	}

	public void setNomap(String nomap) {
		this.nomap = nomap;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nomap=" + nomap + ", salario=" + salario + "]";
	}

}
