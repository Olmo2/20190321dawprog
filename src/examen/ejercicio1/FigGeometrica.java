package examen.ejercicio1;

import java.awt.Color;

public abstract class FigGeometrica {

	
		Color color;
		int posicion;
		boolean relleno;
		
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		public int getPosicion() {
			return posicion;
		}
		public void setPosicion(int posicion) {
			this.posicion = posicion;
		}
		public boolean isRelleno() {
			return relleno;
		}
		public void setRelleno(boolean relleno) {
			this.relleno = relleno;
		}
		
		@Override
		public String toString() {
			return "FigGeometrica [color=" + color + ", posicion=" + posicion + ", relleno=" + relleno + "]";
		}
		public FigGeometrica(Color color, boolean relleno) {
			super();
			this.color = color;
			this.relleno = relleno;
		}
		
		
}
