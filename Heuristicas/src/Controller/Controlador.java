package Controller;


import java.util.List;

import javax.swing.SwingUtilities;

import Model.Dijkstra;
import Model.Grafo;
import Model.Nodo;
import View.PanelMapa;
import View.PanelOpciones;
import View.Ventana;

public class Controlador {

	private Grafo grafo;
	private Dijkstra dijsktra;
	
	public Controlador(Grafo grafo, Dijkstra dijkstra) {
		this.grafo = grafo;
		this.dijsktra = dijkstra;
	}
	
	public void inciar() {
		crearVentana();
	}
	
	public void crearVentana() {
		List<Nodo> nodos = grafo.getNodos();
		PanelOpciones panelOpciones = new PanelOpciones();
		PanelMapa panelMapa = new PanelMapa(nodos);
		SwingUtilities.invokeLater(() -> {
			Ventana ventana = new Ventana(panelOpciones, panelMapa);
			ventana.setVisible(true);
		});
	}
	
	
	
	
}
