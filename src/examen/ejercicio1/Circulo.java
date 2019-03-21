package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends FigGeometrica implements Movible{

	
	public Circulo(Color color, boolean relleno) {
		super(color, relleno);
		// TODO Auto-generated constructor stub
	}

	int radio;

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + ", posicion=" + posicion + ", relleno=" + relleno + "]";
	}
	
}
