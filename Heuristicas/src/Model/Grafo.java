package Model;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

	private List<Nodo> nodos;
	private int[][] costo;
	
	public Grafo() {
		nodos = new ArrayList<>();
		
		nodos.add(new Nodo(730, 533, "Ciudad de México"));
		nodos.add(new Nodo(584, 500, "Guadalajara"));
		nodos.add(new Nodo(465, 147, "Ciudad Juárez"));
		nodos.add(new Nodo(100, 100, "Tijuana"));
		nodos.add(new Nodo(580, 485, "Zapopan"));
		nodos.add(new Nodo(683, 330, "Monterrey"));
		nodos.add(new Nodo(473, 244, "Chihuahua"));
		nodos.add(new Nodo(1095, 462, "Mérida"));
		nodos.add(new Nodo(675, 425, "San Luis Potosí"));
		nodos.add(new Nodo(610, 445, "Aguascalientes"));
		nodos.add(new Nodo(285, 235, "Hermosillo"));
		nodos.add(new Nodo(650, 350, "Saltillo"));
		nodos.add(new Nodo(160, 120, "Mexicalli"));
		nodos.add(new Nodo(434, 384, "Culiacán"));
		nodos.add(new Nodo(700, 600, "Acapulco de Juárez"));
		
		costo = new int[][] {
			{0,  531, 1790, 2743,  540,  898, 1429, 1306,  402,  484, 1884,  834, 2576, 1216,  378},
			{531,    0, 1526, 2215,   10,  787, 1165, 1840,  328,  220, 1356,  698, 2047,  687,  859},
			{1790, 1526,    0, 1164, 1543, 1349,  355, 3100, 1384, 1312,  847, 1092, 1007, 1088, 2181},
			{2743, 2215, 1164,    0, 2214, 2506, 1354, 4055, 2383, 2311,  863, 2091,  175, 1553, 3074},
			{540,   10, 1543, 2214,    0,  795, 1173, 1848,  336,  228, 1351,  706, 2042,  682,  867},
			{898,  787, 1349, 2506,  795,   0,  803, 1986,  512,  573, 1709,   88, 2169, 1040, 1281},
			{1429, 1165,  355, 1354, 1173,  803,   0, 2737, 1021,  949,  696,  729, 1196,  736, 1818},
			{1306, 1840, 3100, 4055, 1848, 1986, 2737,    0, 1711, 1793, 3202, 2143, 3893, 2533, 1574},
			{402,  328, 1384, 2383,  336,  512, 1021, 1711,    0,  165, 1602,  447, 2221,  934,  783},
			{484,  220, 1312, 2311,  228,  573,  949, 1793,  165,    0, 1572,  478, 2149,  904,  866},
			{1884, 1356,  847,  863, 1351, 1709,  696, 3202, 1602, 1572,    0, 1633,  693,  691, 2212},
			{834,  698, 1092, 2091,  706,   88,  729, 2143,  447,  478, 1633,    0, 1929,  962, 1216},
			{2576, 2047, 1007,  175, 2042, 2169, 1196, 3893, 2221, 2149,  693, 1929,    0, 1384, 2904},
			{1216,  687, 1088, 1553,  682, 1040,  736, 2533,  934,  904,  691,  962, 1382,    0, 1557},
			{378,  859, 2181, 3074,  867, 1281, 1812, 1574,  784,  866, 2212, 1217, 2903, 1543,    0}
			};
	}
	
	public List<Nodo> getNodos() {
		return nodos;
	}
	
	public int[][] getCostos() { 
		return costo;
	}
}
