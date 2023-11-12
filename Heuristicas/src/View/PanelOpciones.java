package View;

import javax.swing.*;

import Controller.Controlador;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel{
	
	String [] listaDeElementos = {"Ciudad de México", "Guadalajara", "Ciudad Juárez", "Tijuana", "Zapopan", "Monterrey",
			"Chihuahua", "Mérida", "San Luis Potosí", "Aguascalientes", "Hermosillo", "Saltillo", "Mexicali", "Culiacán", 
			"Acapulco de Juárez"};
	private JButton caminoCorto = new JButton("Calcular el camino mas corto");
	private JButton caminoLargo = new JButton("Calcular el camino mas largo");
	private JButton limpiar = new JButton("Limpiar");
	private JComboBox<String> listaPaises = new JComboBox<>(listaDeElementos);
	private JLabel origen = new JLabel("Seleccione el Origen: ");
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
		this.add(listaPaises, gbc);
		
		//Configuraciones para el boton de Calcular
		caminoCorto.setActionCommand("RutaCorta");
		caminoCorto.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(caminoCorto, gbc);
		
		//Configuraciones para el boton de Calcular
		caminoLargo.setActionCommand("RutaLarga");
		caminoLargo.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(caminoLargo, gbc);
		
		//Configuraciones para la etiqueta "Cantidad"
		distancia.setOpaque(true);
		distancia.setBackground(Color.WHITE);
		distancia.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 6; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(distancia, gbc);
		
		//Configuraciones para el area de texto "Mostrar Cantidad"
		mostrarDistancia.setBackground(Color.WHITE);
		mostrarDistancia.setEditable(false);
		mostrarDistancia.setAlignmentY(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 7; 
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 40;
		gbc.insets = new Insets(0, 0, 0, 0);
		this.add(mostrarDistancia, gbc);
		
		//Configuraciones para el boton de Limpiar
		limpiar.setActionCommand("Limpiar");
		limpiar.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.weightx = 1.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 0, 5, 0);
		this.add(limpiar, gbc);
		
	}
	
	public int getNodoInicio() {
		return listaPaises.getSelectedIndex();
	}
	
	public String getNombreNodo(int pos) {
		return (String)listaPaises.getSelectedItem();
	}
	
	public void setListener (ActionListener listener) {
		caminoCorto.addActionListener(listener);
		caminoLargo.addActionListener(listener);
		limpiar.addActionListener(listener);
	}
	
	public void setTexto(String resultado) {
		mostrarDistancia.setText(resultado);
	}
	
	public void limpiarTexto() {
		mostrarDistancia.setText("");
	}
	
}
