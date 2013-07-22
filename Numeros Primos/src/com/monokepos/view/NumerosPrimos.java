package com.monokepos.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class NumerosPrimos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public NumerosPrimos() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(28, 25, 78, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(114, 22, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnMostrarPrimos = new JButton("Mostrar Primos");
		btnMostrarPrimos.setBounds(241, 22, 154, 21);
		add(btnMostrarPrimos);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 63, 430, 226);
		add(textPane);

	}
}
