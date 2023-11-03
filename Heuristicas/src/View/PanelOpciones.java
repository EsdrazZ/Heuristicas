package View;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelOpciones extends JPanel{
	
	String [] listaDeElementos = {"1", "2"};
	private JButton calcCamino = new JButton("Calcular el Camino");
	private JComboBox listaPaises = new JComboBox(listaDeElementos);
	private JLabel origen = new JLabel("Seleccione el Origen: ");
	private JLabel destino = new JLabel("Seleccione el Destino: ");
	
	public PanelOpciones () {
		this.setLayout(new GridLayout(7,1));
		
		this.add(origen);
		this.add(listaPaises);
		this.add(destino);
		this.add(listaPaises);
		this.add(calcCamino);	
	}
}
