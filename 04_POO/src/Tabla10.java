
public class Tabla10 extends TablaEnteros {
	public static void main(String[] args) {

		int[] diez = { 34, 56, 67, 8 };
	
		for (int i = 0; i < 4; i++) {
			if (diez[i] % 2 == 0) {
				System.out.println("los pares son:" + diez[i]);
			}
		}
	}
}
