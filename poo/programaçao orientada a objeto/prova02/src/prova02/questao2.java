package prova02;

import javax.swing.JOptionPane;

public class questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automovel car1 = new automovel();
		automovel car2 = new automovel();
		
		JOptionPane.showMessageDialog(null, "insira os dados do primeiro carro.");
		car1.inserir();
		
		JOptionPane.showMessageDialog(null, "insira os dados do segundo carro.");
		car2.inserir();
		
		JOptionPane.showMessageDialog(null, "dados do primeiro carro.");
		car1.preco();
		car1.modelo();
		car1.cor();
		car1.nomecombus();
		JOptionPane.showMessageDialog(null, "dados do segundo carro.");
		car2.preco();
		car2.modelo();
		car2.cor();
		car2.nomecombus();
		
		if (car1.preco > car2.preco){
			JOptionPane.showMessageDialog(null, "o carro mais caro é "+car1.modelo+", e custa: "+car1.preco);
		}
		else if (car1.preco < car2.preco){
			JOptionPane.showMessageDialog(null, "o carro mais caro é "+car2.modelo+", e custa: "+car2.preco);
		}
		else {
			JOptionPane.showMessageDialog(null, "Os carros tem o mesmo preço.");
		}
		

	}

}
