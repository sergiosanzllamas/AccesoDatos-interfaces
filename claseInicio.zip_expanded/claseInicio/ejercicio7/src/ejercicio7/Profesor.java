package ejercicio7;

public class Profesor extends Persona {
	int numasig;
	boolean tutor;

	public Profesor(String dni, String nomap, double salario, int numasig, boolean tutor) {
		super(dni, nomap, salario);
		this.numasig = numasig;
		this.tutor = tutor;

	}

	public int getNumasig() {
		return numasig;
	}

	public void setNumasig(int numasig) {
		this.numasig = numasig;
	}

	public boolean isTutor() {
		return tutor;
	}

	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	@Override
	public String toString() {
		return "Profesor [numasig=" + numasig + ", tutor=" + tutor + ", dni=" + dni + ", nomap=" + nomap + ", salario="
				+ salario + "]";
	}
	public void tutorizar() {
		
		
	}

}
