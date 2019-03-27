package examen.ejercicio4;

import java.util.*;
import java.util.regex.*;

public class Ejercicio4 {
	/*
	 * if (mat.matches()) { if (cambio = false) { for (i = 0; i < entrada.length();
	 * i++) { nombre = nombre + entrada.charAt(i); if (entrada.charAt(i) == '-')
	 * cambio = true; } } else { for (int j = i; j < entrada.length(); j++) { tlf =
	 * tlf + entrada.charAt(j); } } agenda.put(nombre, tlf); } else {
	 * System.out.println("FORMATO INCORRECTO"); }
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map<String, String> agenda = new HashMap<String, String>();
		agenda.put("olmo", "123456789");
		agenda.put("maria", "000000009");
		String nombre = "";
		String tlf = "";
		String oldTlf = "";
		String nombreBuscado = "";
	//	int k = 1;
		int o = 0;
		String entrada = "";

		// Bucle para hacer varias entradas
		do {
			System.out.print("> ");
			entrada = teclado.nextLine();
			// patron del telefono
			Pattern patrontlf = Pattern.compile("[a-zA-Z]+-[0-9]{9}");
			Pattern patronBuscar = Pattern.compile("[b][u][s][c][a][r]:[a-zA-Z]+");
			Pattern patronfin = Pattern.compile("[f][i][n]");
	//		Pattern patronNombre = Pattern.compile("[a-zA-Z]+");
//		Matcher nombres = patronNombre.matcher(entrada);
			Matcher fin = patronfin.matcher(entrada);
			Matcher mat = patrontlf.matcher(entrada);
			Matcher matBuscar = patronBuscar.matcher(entrada);
			if (fin.matches())
				o = 1;
			else {

				if (matBuscar.matches()) {
					for (int i = 0; i < entrada.length(); i++) {
						if (entrada.charAt(i) == ':') {
							for (int j = i + 1; j < entrada.length(); j++) {
								nombreBuscado = nombreBuscado + entrada.charAt(j);
							}
						}

					}
					if (agenda.get(nombreBuscado) == null) {
						System.out.println(nombreBuscado + " no se encuentra en la agenda");
						nombreBuscado = "";

					} else {
						agenda.get(nombreBuscado);
						System.out.println(nombreBuscado + ": -> " + agenda.get(nombreBuscado));
						nombreBuscado = "";

					}

				}
				if (mat.matches()) {

					for (int i = 0; i < entrada.length(); i++) {
						Matcher nombres = patrontlf.matcher(entrada.substring(i));
						if (entrada.charAt(i) == '-') {
							for (int j = i + 1; j < entrada.length(); j++) {
								tlf = tlf + entrada.charAt(j);

							}
						} else if (nombres.matches()) {
							nombre = nombre + entrada.charAt(i);

						}
					}
					if (agenda.containsKey(nombre)) {
						oldTlf = agenda.get(nombre);
						
						if(tlf.equals(oldTlf)) {
							System.out.println("Eres muy tonto " + oldTlf + " y " + tlf + " Son iguales..."  );
						}
						else {
							System.out.println("El Número de " + nombre + " Ha sido actualizado de: " + oldTlf + " a: " + tlf);
						}
						agenda.replace(nombre, tlf);
						nombre = "";
						tlf = "";
						
					} else {
						agenda.put(nombre, tlf);
						nombre = "";
						tlf = "";

					}

				} else if (!mat.matches() && !matBuscar.matches())
					System.out.println("FORMATO INCORRECTO");
			}
//	    System.out.println("Entrada: ");
//		 entrada = teclado.nextLine();
		} while (o == 0);
//	    if(o==2) {
//	    	Iterator<String> it = agenda.keySet().iterator();
//		    while(it.hasNext()){
//		      String key = it.next();
//		      
//		      System.out.println( key + ": -> " + agenda.get(key));
//		    }
//	    }else

		// System.out.println(agenda);
//	    Iterator<String> it = agenda.keySet().iterator();
//	    while(it.hasNext()){
//	      String key = it.next();
//	      
//	      System.out.println("Nombre: " + key + " -> Tlf: " + agenda.get(key));
		teclado.close();
	}
}
