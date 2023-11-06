package View;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class PanelOpciones extends JPanel{
	
	String [] listaDeElementos = {"Ciudad de México", "Guadalajara", "Ciudad Juárez", "Tijuana", "Zapopan", "Monterrey",
			"Chihuahua", "Mérida", "San Luis Potosí", "Aguascalientes", "Hermosillo", "Saltillo", "Mexicali", "Culiacán", 
			"Acapulco de Juárez"};
	private JButton calcCamino = new JButton("Calcular el Camino");
	private JComboBox listaPaisesOrigen = new JComboBox(listaDeElementos);
	private JComboBox listaPaisesDestino = new JComboBox(listaDeElementos);
	private JLabel origen = new JLabel("Seleccione el Origen: ");
	private JLabel destino = new JLabel("Seleccione el Destino: ");
	private JLabel distancia = new JLabel("Cantidad de Km. recorridos");
	private JTextArea mostrarDistancia = new JTextArea();
	
	
	public PanelOpciones () {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 0, 10, 0);
		
		// Configuraciones para la etiqueta "Origen"
		origen.setOpaque(true);
		origen.setBackground(Color.WHITE);
		origen.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(origen, gbc);
		
		//Configuraciones para el ComboBox de Paises de Origen
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 30;
		gbc.insets = new Insets(0, 0, 10, 0);
		this.add(listaPaisesOrigen, gbc);
		
		//Configuraciones para la etiqueta "Destino"
		destino.setOpaque(true);
		destino.setBackground(Color.WHITE);
		destino.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(15, 0, 5, 0);
		this.add(destino, gbc);
		
		//Configuraciones para el ComboBox de Paises de Destino
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 30;
		gbc.insets = new Insets(0, 0, 5, 0);
		this.add(listaPaisesDestino, gbc);
		
		//Configuraciones para el boton de Calcular
		calcCamino.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(calcCamino, gbc);
		
		//Configuraciones para la etiqueta "Cantidad"
		distancia.setOpaque(true);
		distancia.setBackground(Color.WHITE);
		distancia.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 5; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(distancia, gbc);
		
		//Configuraciones para el area de texto "Mostrar Cantidad"
		mostrarDistancia.setBackground(Color.WHITE);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 6; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 40;
		gbc.insets = new Insets(0, 0, 0, 0);
		this.add(mostrarDistancia, gbc);
		
	}
	
	public String getListaOrigen() {
		return listaPaisesOrigen.getActionCommand();
	}
	
	public String getListaDestino() {
		return listaPaisesDestino.getActionCommand();
	}
}
