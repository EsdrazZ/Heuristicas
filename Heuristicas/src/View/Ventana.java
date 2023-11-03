package View;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Ventana extends JFrame{
	
	private PanelOpciones panelOpciones;
	private PanelMapa mapa;
	
	public Ventana(PanelOpciones panelOpciones) {
		this.panelOpciones = panelOpciones;
		
		setTitle("Heuristicos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		
		panelOpciones.setBackground(Color.blue);
		
		//mapa = new ImageIcon("C:\\Users\\esdra\\git\\Heuristicas\\Heuristicas\\Resources\\MapaMexico.jpg");
		
		
			
	}
}
