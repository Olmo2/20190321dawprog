package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends FigGeometrica implements Movible{

	
	public Rectangulo(Color color, boolean relleno) {
		super(color, relleno);
		// TODO Auto-generated constructor stub
	}
	int base;
	int altura;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", color=" + color + ", posicion=" + posicion
				+ ", relleno=" + relleno + "]";
	}
	
	
}
