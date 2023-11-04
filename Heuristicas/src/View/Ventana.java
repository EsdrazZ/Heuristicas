package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class Ventana extends JFrame{
	
	private PanelOpciones panelOpciones;
	private PanelMapa panelMapa;
	
	public Ventana(PanelOpciones panelOpciones, PanelMapa panelMapa) {
		this.panelOpciones = panelOpciones;
		this.panelMapa = panelMapa;
		
		setTitle("Heuristicos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500, 800);
		setLocationRelativeTo(null);
		
		panelOpciones.setBackground(Color.CYAN);
		panelOpciones.setPreferredSize(new Dimension(200,0));
		this.getContentPane().add(panelOpciones, BorderLayout.WEST);
		this.getContentPane().add(panelMapa, BorderLayout.CENTER);
	
		
	}
}
