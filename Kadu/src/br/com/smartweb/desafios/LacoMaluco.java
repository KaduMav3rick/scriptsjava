package br.com.smartweb.desafios;

import javax.swing.JOptionPane;

public class LacoMaluco {

	public static void main(String[] args) {
		
		double numero, media, soma;
		int cont;
		
		cont = 0;
		soma = 0;
		
		while(cont < 2) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:" ));
			soma += numero;
			           cont ++;
			         
		}
		
		media = (soma / cont);
		
		JOptionPane.showMessageDialog(null, "A média é: " + media);
		

	}

}
