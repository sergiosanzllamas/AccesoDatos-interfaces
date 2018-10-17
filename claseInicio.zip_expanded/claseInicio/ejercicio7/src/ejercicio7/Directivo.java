package ejercicio7;

public class Directivo extends Persona {
	boolean salesiano;
	char turno;

	public Directivo(String dni, String nomap, double salario, boolean salesiano, char turno) {
		super(dni, nomap, salario);
		this.salesiano = salesiano;
		this.turno = turno;
	}

	protected boolean isSalesiano() {
		return salesiano;
	}

	protected void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	protected char getTurno() {
		return turno;
	}

	protected void setTurno(char turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nomap=" + nomap + ", salario=" + salario + ", salesiano=" + salesiano
				+ ", turno=" + turno + "]";
	}

}
