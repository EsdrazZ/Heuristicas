package Controller;


import java.util.List;

import javax.swing.SwingUtilities;

import Model.Grafo;
import Model.Nodo;
import View.PanelMapa;
import View.PanelOpciones;
import View.Ventana;

public class Controlador {

	private Grafo grafo;
	
	public Controlador(Grafo grafo) {
		this.grafo = grafo;
	}
	
	public void inciar() {
		List<Nodo> nodos = grafo.getNodos();
		
		PanelOpciones panelOpciones = new PanelOpciones();
		PanelMapa panelMapa = new PanelMapa(nodos);
		SwingUtilities.invokeLater(() -> {
			Ventana ventana = new Ventana(panelOpciones, panelMapa);
			ventana.setVisible(true);
		});
	}
	
	
}
