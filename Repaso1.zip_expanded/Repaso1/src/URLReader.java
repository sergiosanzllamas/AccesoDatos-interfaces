

import java.net.*;
import java.io.*;

public class URLReader {
	public static void main(String[] args) throws Exception {
		
		URL direccion = new URL("http://www.spanishdict.com/traductor/casa");
		String tocho = "";
		
		int corte_inicial = tocho.indexOf("kkk");
		int corte_fin = tocho.indexOf("");
		String html = obtenerHTML (direccion);
		System.out.println(html);
	
	}
	
	public static String obtenerHTML (URL direccionWeb) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
		String inputLine, codigo="";

		while ((inputLine = in.readLine()) != null)
			codigo+=inputLine;

		in.close();
		
		return codigo;
	}
}
