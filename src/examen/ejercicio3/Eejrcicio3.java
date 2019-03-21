package examen.ejercicio3;

import java.util.*;

public class Eejrcicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Set<String> compuestos = new HashSet<String>();
		Set<String> compFinal = new HashSet<String>();
		String temporal = "";
		String s = "";
		System.out.println("Numero de compuestos a escribir:");
		int n = teclado.nextInt();

		for (int i = 0; i < n; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Introducir compuesto nº: " + (i+1));
			
			s = s + in.nextLine() + " ";
				
			compuestos.add(s);
		}
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == ' ' || j == s.length() - 1) {
				temporal = temporal + s.charAt(j);
				compFinal.add(temporal);
				temporal = "";
			} else if (compFinal.contains(s.charAt(j)))
				temporal = temporal;
			else
				temporal = temporal + s.charAt(j);

		}
		System.out.println(compFinal);

	}

}
