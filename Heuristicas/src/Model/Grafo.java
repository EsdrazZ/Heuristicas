package Model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Nodo> nodos;
	
	public Grafo() {
		nodos = new ArrayList<>();
		
		nodos.add(new Nodo(1875, 1794, "Ciudad de México"));
		nodos.add(new Nodo(1431, 1668, "Guadalajara"));
		nodos.add(new Nodo(1203, 552, "Ciudad Juárez"));
		nodos.add(new Nodo(261, 360, "Tijuana"));
		nodos.add(new Nodo(1464, 1638, "Zapopan"));
		nodos.add(new Nodo(1803, 1113, "Monterrey"));
		nodos.add(new Nodo(1194, 768, "Chihuahua"));
		nodos.add(new Nodo(2805, 1565, "Mérida"));
		nodos.add(new Nodo(1752, 1449, "San Luis Potosí"));
		nodos.add(new Nodo(1746, 1452, "Aguascalientes"));
		nodos.add(new Nodo(753, 795, "Hermosillo"));
		nodos.add(new Nodo(1683, 1158, "Saltillo"));
		nodos.add(new Nodo(423, 408, "Mexicali"));
		nodos.add(new Nodo(1071, 1191, "Culiacán"));
		nodos.add(new Nodo(1791, 2007, "Acapulco de Juárez"));
	}
	
	public List<Nodo> getNodos() {
		return nodos;
	}
}
