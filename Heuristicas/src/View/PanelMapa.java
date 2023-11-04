package View;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.*;

import Model.Nodo;


public class PanelMapa extends JPanel{
	
	private List<Nodo> nodos;
	private Image mapa;
	
	public PanelMapa(List<Nodo> nodos){
		this.nodos = nodos;
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
		}
	}
	
}
