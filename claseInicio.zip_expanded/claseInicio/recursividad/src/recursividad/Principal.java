package recursividad;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int resultado;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = teclado.nextInt();
        resultado = factorial(numero);
        System.out.println("Factorial: "+resultado);
	}

	private static int factorial(int numero) {
		// TODO Auto-generated method stub
		if(numero == 1)
			return 1;
		else
			return numero * factorial(numero-1);
	}

}
