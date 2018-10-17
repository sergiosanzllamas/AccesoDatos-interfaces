
public class Fecha {
	int dia = 20;
	int mes = 5;
	int año = 2107;

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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public static void escribirCorta(Fecha miFecha) {
		System.out.println(miFecha.dia + "/" + miFecha.mes + "/" + miFecha.año);
	}

	public static void escribirLarga(Fecha miFecha) {
		System.out.println("hoy es dia :" + miFecha.dia + "del mes:" + miFecha.mes + " del año:" + miFecha.año);
	}

	public static boolean correcta(Fecha miFecha) {
		if ((miFecha.dia <= 31 && miFecha.dia > 0) && (miFecha.mes >= 1 && miFecha.mes <= 12)
				&& (miFecha.año <= 99999 && miFecha.año >= 2000))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Fecha miFecha = new Fecha();

		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.año);

		escribirLarga(miFecha);

		correcta(miFecha);
		System.out.println(miFecha.correcta(miFecha));

	}

}
