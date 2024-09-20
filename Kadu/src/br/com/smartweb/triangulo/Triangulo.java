package br.com.smartweb.triangulo;
import javax.swing.*;

public class Triangulo {

	public static void main(String[] args) {
		int A, B, C;
		A = Integer.parseInt(JOptionPane.showInputDialog("lado A"));
		B = Integer.parseInt(JOptionPane.showInputDialog("lado B"));
		C = Integer.parseInt(JOptionPane.showInputDialog("lado C"));
		if((A !=0 && B !=0 && C !=0)) {
			if((A + B > C) && (A + C > B) && (B + C > A)) {
				if((A != B) && (A != C) && (B != C)){
					JOptionPane.showMessageDialog(null, "escaleno");
				} else {
					if((A == B) && (B == C)) {
						JOptionPane.showMessageDialog(null, "equilatero");
					} else {
						JOptionPane.showMessageDialog(null, "isosceles");
					}
					}
			}else {
				JOptionPane.showMessageDialog(null, "nao forma um triangulo");
			}
		}else {
			JOptionPane.showMessageDialog(null, "nao forma um triangulo");
		}
	}
}
					
