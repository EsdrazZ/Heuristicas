package View;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.*;

import Model.Nodo;


public class PanelMapa extends JPanel{
	
	private List<Nodo> nodos;
	private List<Integer> ruta;
	private String nodoInicio;
	private Image mapa;
	private String metodoPintura = null;
	
	public PanelMapa(){
	}
	
	public void setNodos(List<Nodo> nodos) {
		this.nodos = nodos;
	}
	
	public void setMetodoPintura (String metodoPintura) {
		this.metodoPintura = metodoPintura;
		repaint();
	}
	
	public void setRuta(List<Integer> ruta) {
		this.ruta = ruta;
	}
	
	public void setNodoInicio(String nodoInicio) {
		this.nodoInicio = nodoInicio;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		mapa = new ImageIcon(getClass().getResource("/images/MapaMexico.jpg")).getImage();
		g.drawImage(mapa, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		
		for (Nodo nodo : nodos) {
			int x = nodo.getX();
			int y = nodo.getY();

			g.setColor(Color.RED);
			g.fillOval(x, y, 10, 10);
			
			g.setColor(Color.RED);
			g.drawString(nodo.getNombre(), x + 12, y);
		}
		
		//Establecemos que funcion debemos pintar dependiendo de la accion del boton en el controlador
		if(metodoPintura == "RUTA_CERCANA" && ruta != null) {
			paintRutaCercana(g, ruta, nodoInicio);
		}
		else if(metodoPintura == "RUTA_LEJANA" && ruta != null) {
			paintRutaLejana(g, ruta, nodoInicio);
		}
		
	}
	
	public void paintRutaCercana(Graphics g, List<Integer> ruta, String nodoInicio) {
		super.paintComponent(g);
		mapa = new ImageIcon(getClass().getResource("/images/MapaMexico.jpg")).getImage();
		g.drawImage(mapa, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		
		for (Nodo nodo : nodos) {
			int x = nodo.getX();
			int y = nodo.getY();
			
			//Pinta al nodo inicial en color verde
			if(nodo.getNombre() == nodoInicio) {
				g.setColor(Color.GREEN);
				g.fillOval(x, y, 5, 5);
				g.setColor(Color.GREEN);
				g.drawString(nodo.getNombre(), x + 12, y);
			}
			else {
				g.setColor(Color.RED);
				g.fillOval(x, y, 5, 5);
				g.setColor(Color.RED);
				g.drawString(nodo.getNombre(), x + 12, y);
			}
		}
		
		for(int i = 0; i < ruta.size() - 1; i++) {
			int indexNodoActual = ruta.get(i);
			int indexNodoSiguiente = ruta.get(i + 1);
			
			Nodo nodoActual = nodos.get(indexNodoActual);
			Nodo nodoSiguiente = nodos.get(indexNodoSiguiente);
			
			//Dibuja las aristas entre los nodos
			g.setColor(Color.BLUE);
			g.drawLine(nodoActual.getX(), nodoActual.getY(), nodoSiguiente.getX(), nodoSiguiente.getY());
		}
		
	}
	
	public void paintRutaLejana (Graphics g, List<Integer> ruta, String nodoInicio) {
		super.paintComponent(g);
		mapa = new ImageIcon(getClass().getResource("/images/MapaMexico.jpg")).getImage();
		g.drawImage(mapa, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		
		for (Nodo nodo : nodos) {
			int x = nodo.getX();
			int y = nodo.getY();

			//Pinta al nodo inicial en color verde
			if(nodo.getNombre() == nodoInicio) {
				g.setColor(Color.GREEN);
				g.fillOval(x, y, 5, 5);
				g.setColor(Color.GREEN);
				g.drawString(nodo.getNombre(), x + 12, y);
			}
			else {
				g.setColor(Color.RED);
				g.fillOval(x, y, 5, 5);
				g.setColor(Color.RED);
				g.drawString(nodo.getNombre(), x + 12, y);
			}
		}
		
		for(int i = 0; i < ruta.size() -1; i++) {
			int indexNodoActual = ruta.get(i);
			int indexNodoFinal = ruta.get(i + 1);
			
			Nodo nodoActual = nodos.get(indexNodoActual);
			Nodo nodoSiguiente = nodos.get(indexNodoFinal);
			
			//Dibuja las aristas entre los nodos
			g.setColor(Color.BLUE);
			g.drawLine(nodoActual.getX(), nodoActual.getY(), nodoSiguiente.getX(), nodoSiguiente.getY());
		}
	}
	
}
