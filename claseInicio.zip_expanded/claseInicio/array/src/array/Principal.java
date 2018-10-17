package array;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,8,9};
		int contador = 0;
		for(int i=0; i<array.length;i++) {
			if(array[i] % 2 == 0)
				contador++;
		}
		System.out.println(contador);
	}

}
