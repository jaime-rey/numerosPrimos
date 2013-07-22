package com.monokepos.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class NumerosPrimos extends JFrame implements Runnable, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private Thread ir;

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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
