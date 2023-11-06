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
			    {0, 531, 1790, 2743, 540, 898, 1429, 1306, 402, 484, 1884, 834, 2576, 1216},
			    {532, 0, 1526, 2215, 10, 787, 1165, 1840, 328, 220, 1356, 698, 2047, 687, 859},
			    {1806, 1535, 0, 1164, 1543, 1349, 355, 3100, 1384, 1312, 847, 1092, 1007, 1088, 2181},
			    {2747, 2218, 1164, 0, 2214, 2506, 1354, 4055, 2383, 2311, 863, 2091, 175, 1553, 3074},
			    {540, 10, 1543, 2209, 0, 795, 1173, 1848, 336, 228, 1351, 706, 2042, 682, 867},
			    {906, 795, 1169, 2326, 804, 0, 803, 1986, 512, 573, 1709, 88, 2169, 1040, 1281},
			    {1443, 1172, 355, 1353, 1180, 809, 0, 2737, 1021, 949, 696, 729, 1196, 736, 1818},
			    {1316, 1849, 3099, 4061, 1857, 1991, 2738, 0, 1711, 1793, 3202, 2143, 3893, 2533, 1574},
			    {408, 328, 1378, 2378, 336, 511, 1017, 1702, 0, 165, 1602, 447, 2221, 934, 783},
			    {491, 219, 1306, 2306, 228, 567, 945, 1785, 166, 0, 1572, 478, 2149, 904, 866},
			    {1885, 1356, 847, 860, 1351, 1713, 697, 3193, 1681, 1572, 0, 1633, 693, 691, 2212},
			    {841, 705, 1085, 2085, 714, 87, 724, 2135, 448, 483, 1631, 0, 1929, 962, 1216},
			    {2578, 2049, 1007, 169, 2044, 2349, 1198, 3885, 2227, 2155, 694, 1935, 0, 1384, 2904},
			    {1230, 701, 1086, 1550, 696, 1058, 736, 2537, 1026, 917, 691, 978, 1382, 0, 1557},
			    {378, 859, 2172, 3070, 867, 1280, 1812, 1566, 784, 866, 2212, 1217, 2903, 1543, 0}
			};
        
	}
	
	public List<Nodo> getNodos() {
		return nodos;
	}
	
	public int[][] getCostos() { 
		return costo;
	}
}
