package br.com.smartweb.desafios;

import javax.swing.JOptionPane;

public class LacoMaluco3 {

	public static void main(String[] args) {
		
		double numero, media, soma;
		
		int cont;
		
		soma =0;
		
		for( cont = 0; cont < 5; cont++) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número "));
			
			soma += numero;
			
		}
		
		media = (soma / cont);
		JOptionPane.showMessageDialog(null, " A média é" + media);
	}

}
