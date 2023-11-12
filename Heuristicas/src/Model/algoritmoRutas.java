package Model;

import java.util.*;

public class algoritmoRutas {
	
	
	public algoritmoRutas() {
	}
	
	
	public List<Integer> rutaCorta(int[][] costMatrix, int nodoInicio){
		int numNodos = costMatrix.length;
		boolean[] visitados  = new boolean[numNodos];
		List<Integer> ruta = new ArrayList<>();
		
		int nodoActual = nodoInicio;
		visitados[nodoActual] = true;
		ruta.add(nodoActual);
		
		while(ruta.size() < numNodos) {
			int nodoCercano = -1;
			int costoCercano = Integer.MAX_VALUE;
			
			for(int i = 0; i < numNodos; i++) {
				if(!visitados[i] && costMatrix[nodoActual][i] < costoCercano) {
					nodoCercano = i;
					costoCercano = costMatrix[nodoActual][i];
				}
			}
			
			ruta.add(nodoCercano);
			visitados[nodoCercano] = true;
			nodoActual = nodoCercano;
		}
		
		ruta.add(nodoInicio);
		
		return ruta;
	}
	
	public List<Integer> rutaLarga(int [][] costMatrix, int nodoInicio){
		int numNodos = costMatrix.length;
		boolean[] visitados = new boolean[numNodos];
		List<Integer> ruta = new ArrayList<>();
		
		int nodoActual = nodoInicio;
		visitados[nodoActual] = true;
		ruta.add(nodoActual);
		
		while(ruta.size() < numNodos) {
			int nodoCercano = -1;
			int costoCercano = Integer.MIN_VALUE;
			
			for(int i = 0; i < numNodos; i++) {
				if(!visitados[i] && costMatrix[nodoActual][i] > costoCercano) {
					nodoCercano = i;
					costoCercano = costMatrix[nodoActual][i];
				}
			}
			
			ruta.add(nodoCercano);
			visitados[nodoCercano] = true;
			nodoActual = nodoCercano;
			
		}
		
		ruta.add(nodoInicio);
		
		return ruta;
	}
	
}
	
	
	
