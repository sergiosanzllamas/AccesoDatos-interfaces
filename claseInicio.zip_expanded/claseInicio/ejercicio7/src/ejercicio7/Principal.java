package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per1 = new Profesor("453554t", "txema", 566.89, 8, true);
		Profesor per2 = new Profesor("435359y", "joseluis", 5236.89, 8, false);

		Persona dir1 = new Directivo("545445e", "manuel", 6557.0, true, 'T');
		Directivo dir2 = new Directivo("545465r", "jose", 657.0, false, 'M');

		Persona adm1 = new Admin("544445e", "manuel", 665.0, 'M', 1);
		Admin adm2 = new Admin("544145t", "d", 635.0, 'T', 3);
		System.out.println(per1);
		adm1.setSalario(566);
		System.out.println(adm1.getSalario());
		System.out.println(dir2);
		
adm2.aumento();
System.out.println(adm2.getSalario());

	}

}
