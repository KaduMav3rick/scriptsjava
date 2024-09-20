package br.com.smartweb.triangulo;
import javax.swing.*;

public class Produto {

	public static void main(String[] args) {
		int codigo;
		codigo = Integer.parseInt(JOptionPane.showInputDialog("digite o codigo"));
		switch (codigo) {
		case 001 : JOptionPane.showInputDialog(null,"caderno");
		break;
		case 002 : JOptionPane.showInputDialog(null,"lapis");
		break;
		case 003 : JOptionPane.showInputDialog(null,"borracha");
		break;
		default : JOptionPane.showInputDialog(null,"diversos");
		
		
		}


	}

}
