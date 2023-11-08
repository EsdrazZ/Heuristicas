package Controller;


import java.util.List;

import javax.swing.SwingUtilities;

import Model.*;
import View.PanelMapa;
import View.PanelOpciones;
import View.Ventana;

public class Controlador {

	private Grafo grafo;
	private AlgoritmoGenetico algoritmoGenetico;
	
	public Controlador(Grafo grafo, AlgoritmoGenetico algoritmoGenetico) {
		this.grafo = grafo;
		this.algoritmoGenetico = algoritmoGenetico;
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
