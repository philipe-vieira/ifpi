package prova02;

import javax.swing.JOptionPane;

public class automovel {
	String modelo,cor,nomecombus;
	int combustivel,preco;
	
	void inserir(){
		modelo = JOptionPane.showInputDialog(null, "insira o modelo do carro:");
		cor = JOptionPane.showInputDialog(null, "insira a cor do carro:");
		combustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o combustivel do carro \n1-gasolina. \n2-alcool. \n3-diesel. \n4-gas."));
		
	}
	
	int preco(){
		if(combustivel == 1){
			JOptionPane.showMessageDialog(null, "Pre�o: \no automovel custa 12000.");
			preco = 12000;
		}
		else if(combustivel == 2){
			JOptionPane.showMessageDialog(null, "Pre�o: \no automovel custa 10500.");
			preco = 10500;
		}
		else if(combustivel == 3){
			JOptionPane.showMessageDialog(null, "Pre�o: \no automovel custa 20000.");
			preco = 20000;
		}
		else if(combustivel == 4){
			JOptionPane.showMessageDialog(null, "Pre�o: \no automovel custa 13000.");
			preco = 13000;
		}
		else {
			JOptionPane.showMessageDialog(null, "combustivel invalido.");
		}
		return preco;
	}
	String modelo(){
		JOptionPane.showMessageDialog(null, "Modelo do carro: "+modelo);
		return modelo;
	}
	String cor(){
		JOptionPane.showMessageDialog(null, "Cor do carro: "+cor);
		return cor;
	}
	String nomecombus(){
		if(combustivel == 1){
			JOptionPane.showMessageDialog(null, "Movido � gasolina.");
			nomecombus = "gasolina";
		}
		else if(combustivel == 2){
			JOptionPane.showMessageDialog(null, "Movido � alcool.");
			nomecombus = "alcool";
		}
		else if(combustivel == 3){
			JOptionPane.showMessageDialog(null, "Movido � diesel.");
			nomecombus = "diesel";
		}
		else if(combustivel == 4){
			JOptionPane.showMessageDialog(null, "Movido � g�s.");
			nomecombus = "gas";
		}
		else {
			JOptionPane.showMessageDialog(null, "combustivel invalido.");
		}
		return nomecombus;
	}
	void imprime_tudo(){
		JOptionPane.showMessageDialog(null, "modelo: "+modelo);
		JOptionPane.showMessageDialog(null, "cor: "+cor);
		JOptionPane.showMessageDialog(null, "combustivel: "+nomecombus);	
	}
	

}
