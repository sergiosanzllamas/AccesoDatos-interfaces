package practica2;

public class Encontrar {

	public static void main(String[] args) {
		String tocho = "sjdhsldkjhsjjjjjjjjjjjjjjjjjjjjdlhsdjkkksistemasbbbdfkl";
		
		
		int corte_inicial = tocho.indexOf("kkk");
		int corte_fin = tocho.indexOf("bbb");
		
		System.out.println(tocho.substring(corte_inicial+3, corte_fin));
		
		//System.out.println(corte_inicial);
		//System.out.println(corte_fin);
	}

}
