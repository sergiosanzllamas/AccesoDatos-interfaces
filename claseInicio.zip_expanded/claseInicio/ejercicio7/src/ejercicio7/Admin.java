package ejercicio7;

public class Admin extends Persona {
	protected String dni;
	protected String nomap;
	protected double salario;
	char sexo;
	int numhor;

	public Admin(String dni, String nomap, double salario, char sexo, int numhor) {
		super(dni, nomap, salario);
		this.sexo = sexo;
		this.numhor = numhor;
	}

	protected char getSexo() {
		return sexo;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	protected int getNumhor() {
		return numhor;
	}

	protected void setNumhor(int numhor) {
		this.numhor = numhor;
	}

	@Override
	public String toString() {
		return "Admin [dni=" + dni + ", nomap=" + nomap + ", salario=" + salario + ", sexo=" + sexo + ", numhor="
				+ numhor + "]";
	}

	public void aumento() {
		
		salario +=(numhor*10);
		numhor=0;
		
	}
	
}
