package matriz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int [][] matriz  = {{1,2,0},{1,1,4},{0,1,3}};
		
		for(int f = 0; f<matriz.length;f++)
			for(int c=0; c<matriz[f].length;c++)
				suma += matriz[f][c];
		System.out.println("La suma es: "+suma);
	}

}
