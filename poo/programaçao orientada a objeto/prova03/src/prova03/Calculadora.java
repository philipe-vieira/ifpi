package prova03;

import javax.swing.JOptionPane;

public class Calculadora {
	private int x, y;
	
	void inserir(){
		JOptionPane.showMessageDialog(null, "Insira dois valores a serem operados!");
		x = Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor valor: "));
	}
	int Somar(){
		return x + y;
	}
	
	int Subtrair(){
		return x - y;
	}
	
	int Multiplicar(){
		return x * y;
	}
	
	double Dividir(){
		double result = 0;
		result = x / y;
		if (result != 0){
			return result;
		}
		else{
			JOptionPane.showMessageDialog(null, "Opera��o invalida!!! \nDivisor igual a zero.");
		}
		return result;
	}
}