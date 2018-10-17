
public class Metodos {
	public static int sumar(int n1, int n2, int n3, int n4) {
		n1 = n1 / n2 + n3 / n2;
		return n1;
	}

	public static int restar(int n1, int n2, int n3, int n4) {
		n1 = n1 / n2 - n3 / n4;
		return n1;
	}

	public static int multi(int n1, int n2, int n3, int n4) {
		n1 = n1 / n2 * n3 / n4;
		return n1;
	}

	public static int divi(int n1, int n2, int n3, int n4) {
		n1 = n1 / n2 / n3 / n4;
		return n1;
	}

	public static void main(String[] args) {
		int miNumero1 = 9, miNumero2 = 8, miNumero3 = 7, miNumero4 = 2, resultado;
		resultado = sumar(miNumero1, miNumero2, miNumero3, miNumero4);

		System.out.println(miNumero1);
		System.out.println(miNumero2);
		System.out.println(miNumero3);
		System.out.println(miNumero4);
		System.out.println(resultado);
		System.out.println("\n");

		resultado = restar(miNumero1, miNumero2, miNumero3, miNumero4);
		System.out.println(miNumero1);
		System.out.println(miNumero2);
		System.out.println(miNumero3);
		System.out.println(miNumero4);
		System.out.println(resultado);
		System.out.println("\n");
		resultado = multi(miNumero1, miNumero2, miNumero3, miNumero4);
		System.out.println(miNumero1);
		System.out.println(miNumero2);
		System.out.println(miNumero3);
		System.out.println(miNumero4);
		System.out.println(resultado);
		System.out.println("\n");
		resultado = divi(miNumero1, miNumero2, miNumero3, miNumero4);
		System.out.println(miNumero1);
		System.out.println(miNumero2);
		System.out.println(miNumero3);
		System.out.println(miNumero4);
		System.out.println(resultado);
	}

}
