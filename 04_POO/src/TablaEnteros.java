import java.util.Scanner;
import java.util.*;
public class TablaEnteros {
	// Datos
	static TablaTradicional clave;
	int[] tabla;

	// Metodos
	public TablaEnteros() {
		tabla = new int[4];
		tabla[0] = 20;
		tabla[1] = 8;
		tabla[2] = 31;
		tabla[3] = 56;
	}

	public void imprimir(int numero) {
		for (int i = 0; i < 4; i++)
			System.out.println(tabla[i]);
	}
	public void imprimir() {
		for (int i = 0; i < 4; i++)
			System.out.println(tabla[i]);
	}
	public void decir() {
		
		System.out.println("dime algo");
		Scanner algo2= new Scanner(System.in);
		String algo1= algo2.nextLine();
		System.out.println("has metido:"+ algo1);
		
		
	}
}
