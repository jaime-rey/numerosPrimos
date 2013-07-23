package com.monokepos.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class NumerosPrimos extends JFrame implements Runnable, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField = new JTextField("250", 10);
	private Thread ir;
	JButton btnMostrarPrimos = new JButton("Mostrar Primos");
	JLabel lblNewLabel = new JLabel("Cantidad");
	JTextArea textArea = new JTextArea(8, 40);

	/**
	 * Create the panel.
	 */
	public NumerosPrimos() {
		super();
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				System.out.println(info.getName());
				if ("CDE/Motif".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					
				}
			}
		} catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look
			// and feel.
		}
		setSize(400, 200);
		setTitle("Primos");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout borde = new BorderLayout();
		getContentPane().setLayout(borde);

		lblNewLabel.setBounds(28, 25, 78, 14);

		btnMostrarPrimos.setBounds(241, 22, 154, 21);

		btnMostrarPrimos.addActionListener(this);

		JPanel topPanel = new JPanel();
		topPanel.add(lblNewLabel);
		topPanel.add(textField);
		topPanel.add(btnMostrarPrimos);
		getContentPane().add(topPanel, BorderLayout.NORTH);

		textArea.setLineWrap(true);
		JScrollPane panelTexto = new JScrollPane(textArea);
		getContentPane().add(panelTexto, BorderLayout.EAST);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		btnMostrarPrimos.setEnabled(false);
		if (ir == null) {
			ir = new Thread(this);
			ir.start();
		}
		// int cantidad = Integer.parseInt(textField.getText());
		// int numPrimos = 0;
		// int candidato = 2;
		// textArea.append("Primeros " + cantidad + " numeros primos: ");
		// while (numPrimos < cantidad) {
		// if (esPrimo(candidato)) {
		// textArea.append(candidato + " ");
		// numPrimos++;
		// }
		// candidato++;
		// }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int cantidad = Integer.parseInt(textField.getText());
		int numPrimos = 0;
		int candidato = 2;
		textArea.append("Primeros " + cantidad + " numeros primos: ");
		while (numPrimos < cantidad) {
			if (esPrimo(candidato)) {
				textArea.append(candidato + " ");
				numPrimos++;
			}
			candidato++;
		}

	}

	private static boolean esPrimo(int candidato) {
		// TODO Auto-generated method stub
		double raiz = Math.sqrt(candidato);
		for (int i = 2; i <= raiz; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		NumerosPrimos n = new NumerosPrimos();
		System.out.println(n.toString());
	}
}
