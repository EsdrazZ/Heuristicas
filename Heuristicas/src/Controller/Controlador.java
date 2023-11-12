package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import Model.*;
import View.PanelMapa;
import View.PanelOpciones;
import View.Ventana;

public class Controlador implements ActionListener {

	private Grafo grafo;
	private algoritmoRutas algoritmoRutas;
	private PanelOpciones panelOpciones;
	private PanelMapa panelMapa;
	private static final String rutaCercana = "RUTA_CERCANA"; 
	private static final String rutaLejana = "RUTA_LEJANA";
	
	public Controlador(Grafo grafo, algoritmoRutas algoritmoRutas, PanelOpciones panelOpciones, PanelMapa panelMapa) {
		this.grafo = grafo;
		this.algoritmoRutas = algoritmoRutas;
		this.panelOpciones = panelOpciones;
		this.panelMapa = panelMapa;
	}
	
	public void iniciar() {
		List<Nodo> nodos = grafo.getNodos();
		panelMapa.setNodos(nodos);
		panelOpciones.setListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int[][] costMatrix = grafo.getCostos();
		int nodoInicio = panelOpciones.getNodoInicio();
		List<Integer> ruta = new ArrayList<>();
		List<Nodo> nodos = grafo.getNodos();
		String pesoRuta = "";
		
		switch(command) {
			case "RutaCorta":
				
				ruta = algoritmoRutas.rutaCorta(costMatrix, nodoInicio);
				panelMapa.setNodoInicio(panelOpciones.getNombreNodo(nodoInicio));
				panelMapa.setMetodoPintura(rutaCercana);
				panelMapa.setRuta(ruta);
				
				pesoRuta = pesoRuta(ruta, nodos, costMatrix);
				panelOpciones.setTexto(pesoRuta);
				
				break;
					
			case "RutaLarga":
				
				ruta = algoritmoRutas.rutaLarga(costMatrix, nodoInicio);
				panelMapa.setNodoInicio(panelOpciones.getNombreNodo(nodoInicio));
				panelMapa.setMetodoPintura(rutaLejana);
				panelMapa.setRuta(ruta);
				
				pesoRuta = pesoRuta(ruta, nodos, costMatrix);
				panelOpciones.setTexto(pesoRuta);
				
				break;
				
			case "Limpiar":
				
				panelMapa.setMetodoPintura("");
				panelOpciones.limpiarTexto();
				
				break;
		}
	}
	
	public String pesoRuta(List<Integer> ruta, List<Nodo> nodos, int [][] matrixCost) {
		String resultado = "";
		int pesoTotal = 0;
		
		for(int i = 0; i < ruta.size() - 1; i++) {
			int nodoActual = ruta.get(i);
			int nodoSiguiente = ruta.get(i + 1);
			int peso = matrixCost[nodoActual][nodoSiguiente];
			pesoTotal += peso;
		}
		
		resultado += "El peso total es:\n" + pesoTotal;
		
		return resultado;
	}
	
	
	
}
