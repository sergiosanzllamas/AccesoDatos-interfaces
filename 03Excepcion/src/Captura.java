import java.io.IOException;
import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

public class Captura {

	public static int leer() throws IOException {
		try {
			Scanner scan = new Scanner(System.in);
			int numero;
			System.out.println("introduce un numero: ");
			numero = scan.nextInt();
			return numero;
		} catch (Exception ex) {

			throw new IOException("ERROR al lerr");

		}

	}

	public static int leer2() throws NumeroLetra {
		int numero = 0;
		try {
			Scanner scan = new Scanner(System.in);

			System.out.println("introduce un numero: ");
			numero = scan.nextInt();
			return numero;
		} catch (Exception ex) {

			throw new NumeroLetra("Error formato", numero);

		}

	}

	public static void main(String[] args) throws NumeroLetra {
		boolean leido = false;
		while (!leido) {

			try {
				int numero = leer2();
				//System.out.printf("el cuadrado de yu numero es: %d", numero * numero);
				//leido = true;

				
				System.out.printf("el cuadrado de yu numero es: %d", numero * numero);
				leido = true;

			} catch (NumeroLetra ex) {
				System.out.println(ex.getMessage());
			} /*catch (IOException ex) {
				System.out.println("ERROR al lerr ");
			} catch (NoSuchElementException ex) {
				System.out.println("ERROR: " + ex.getMessage());
			}*/
		}

	}
}
