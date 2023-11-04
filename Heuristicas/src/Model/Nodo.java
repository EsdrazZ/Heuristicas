package Model;

public class Nodo {
	
	private int x;
	private int y;
	private String nombre;
	
	public Nodo(int x, int y, String nombre) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getNombre() {
		return nombre;
	}
}
