package Exercicios;

import javax.swing.JOptionPane;

import controller.Controller09;

public class Exercicio09 {

	public static void main (String[] args) {
		
		Controller09 inverter = new Controller09();
		
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		
		String resultado = inverter.inverterString(palavra);
		
		JOptionPane.showMessageDialog(null, "String invertida: " + resultado);
	}
}
