package Main;

import javax.swing.SwingUtilities;
import View.*;
import Controller.Controlador;
import Model.*;

public class Main {

	public static void main(String[] args) {
		
		Grafo grafo = new Grafo();
		algoritmoRutas algoritmoRutas = new algoritmoRutas();
		PanelOpciones panelOpciones = new PanelOpciones();
		PanelMapa panelMapa = new PanelMapa();
		Controlador controlador = new Controlador(grafo, algoritmoRutas, panelOpciones, panelMapa);
		controlador.iniciar();
		
		//Crea la ventana
		SwingUtilities.invokeLater(() -> {
			Ventana ventana = new Ventana(panelOpciones, panelMapa);
			ventana.setVisible(true);
		});
		
	}
}
