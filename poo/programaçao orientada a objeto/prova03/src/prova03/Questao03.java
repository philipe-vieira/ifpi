package prova03;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculo = new Calculadora();
		calculo.inserir();
		JOptionPane.showMessageDialog(null, "Soma = "+calculo.Somar());
		JOptionPane.showMessageDialog(null, "Subtra��o = "+calculo.Subtrair());
		JOptionPane.showMessageDialog(null, "Multiplica��o = "+calculo.Multiplicar());
	    JOptionPane.showMessageDialog(null, "Divis�o = "+calculo.Dividir());

	}

}
