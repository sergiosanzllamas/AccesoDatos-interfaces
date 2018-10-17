import javax.print.DocFlavor.STRING;

public class Nif {
	static int dni = 53961215;
	long NIF;
	char letra;

	public long getNIF() {
		return NIF;
	}

	public void setNIF(long nIF) {
		NIF = nIF;
	}

	char calcularLetra(Nif dni) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";

		int modulo = Nif.dni % 23;
		char letra = juegoCaracteres.charAt(modulo);
		dni.letra = letra;
		return letra;

	}

	boolean comprobarLetra(Nif dni) {
		if (dni.letra == dni.calcularLetra(dni))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Nif n = new Nif();
		char let = n.calcularLetra(n);

		System.out.println(let);
		System.out.println(n.comprobarLetra(n));

	}

}
