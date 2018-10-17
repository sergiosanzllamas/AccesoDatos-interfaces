

public class Principal {
	public static void cambiarFecha(Fecha f) {
		f.dia = f.dia + 1;
		f.mes = 4;
		f.año = 2000;
	}

	public static void main(String[] args) {
		Fecha miFecha = new Fecha();
		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.año);

		cambiarFecha(miFecha);
		System.out.println(miFecha.dia);
		System.out.println(miFecha.mes);
		System.out.println(miFecha.año);
		
		

	}

}
