package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends FigGeometrica implements Movible{

	
	
	public Cuadrado(Color color, boolean relleno) {
		super(color, relleno);
		// TODO Auto-generated constructor stub
	}

	int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", color=" + color + ", posicion=" + posicion + ", relleno=" + relleno + "]";
	}
	
}
