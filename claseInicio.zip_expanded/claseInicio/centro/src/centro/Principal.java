package centro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Profesor p1 = new Profesor("3456712x", "Txema", "Gonzalez", 1230.44, 8, true);
       Profesor p2 = new Profesor("2335567a", "Jose Luis", "Alvarez", 2134.34, 5, true);
       Administracion a1 = new Administracion("98574784d", "Enrique", "Donoso", 324.54, 'H', 3);
       Directivo d1 = new Directivo("23455666g", "Manue","De Castro", 0, true, 'M');
       System.out.println(p1.toString());
       System.out.println(p2.getSalario());
       a1.setApellidos("Cerezo");
       System.out.println(a1.toString());
	}

}
