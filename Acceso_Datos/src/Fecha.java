
public class Fecha {
	int dia = 20;
	int mes = 5;
	int a�o = 2107;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public static void escribirCorta(Fecha miFecha) {
		System.out.println(miFecha.dia + "/" + miFecha.mes + "/" + miFecha.a�o);
	}

	public static void escribirLarga(Fecha miFecha) {
		System.out.println("hoy es dia :" + miFecha.dia + "del mes:" + miFecha.mes + " del a�o:" + miFecha.a�o);
	}

	public static boolean correcta(Fecha miFecha) {
		if ((miFecha.dia <= 31 && miFecha.dia > 0) && (miFecha.mes >= 1 && miFecha.mes <= 12)
				&& (miFecha.a�o <= 99999 && miFecha.a�o >= 2000))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Fecha miFecha = new Fecha();

		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.a�o);

		escribirLarga(miFecha);

		correcta(miFecha);
		System.out.println(miFecha.correcta(miFecha));

	}

}
