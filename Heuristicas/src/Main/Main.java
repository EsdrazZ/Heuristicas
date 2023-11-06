package Main;

import javax.swing.SwingUtilities;
import View.*;
import Controller.Controlador;
import Model.*;

public class Main {

	public static void main(String[] args) {
		
		Grafo grafo = new Grafo();
		Dijkstra dijkstra = new Dijkstra();
		Controlador controlador = new Controlador(grafo, dijkstra);
		
		controlador.inciar();
	}
}
