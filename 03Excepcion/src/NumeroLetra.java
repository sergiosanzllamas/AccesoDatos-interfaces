
public class NumeroLetra extends Exception{
private String mensaje;
private int numero;

public NumeroLetra(String m,int n) {
	mensaje=m;
	numero=n;
}

@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return toString();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return " el error es " +mensaje +"del numero" +numero;
}


}
