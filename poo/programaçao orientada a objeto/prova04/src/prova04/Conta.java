package prova04;

import javax.swing.JOptionPane;

public class Conta {
	int numero,saldo,valordepo,valorsaq,escolha;
	String nome,tipo;
	
	void inserir(){
		nome = JOptionPane.showInputDialog(null,"Digite o nome do titular: ");
		tipo = JOptionPane.showInputDialog(null,"Digite o tipo de conta: \nConta poupan�a. \nConta corrente.");
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da conta:"));
		saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o saldo da conta:"));
	}
	
	void imprimir(){
		JOptionPane.showMessageDialog(null, "Nome da pessoa: "+nome+"\nNumero da conta: "+numero+"\nTipo de conta: "+tipo+"\nSaldo da conta: "+saldo);
		
	}
	
	int deposito(){
		valordepo = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor do deposito:"));
		saldo = saldo + valordepo;
		JOptionPane.showMessageDialog(null, "O saldo � igual a: "+saldo);
		return saldo;
		
	}
	
	int saque(){
		valorsaq = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o valor do saque:"));
		if (valorsaq <= saldo){
			saldo = saldo - valorsaq;
			}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
		JOptionPane.showMessageDialog(null, "O saldo � igual a: "+saldo);
		return saldo;
	}
	void menu(){
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual opera�ao voc� deseja fazer? "
				+ "\n\n1-Deposito \n2-Saque \n3-Mostrar saldo \n4-Informa��es do titular"));
		if (escolha == 1){
			deposito();
		}
		else if(escolha == 2){
			saque();
		}
		else if(escolha == 3){
			JOptionPane.showMessageDialog(null, "O saldo � igual a: "+saldo);
		}
		else if(escolha == 4){
			imprimir();
		}
		else {
			JOptionPane.showMessageDialog(null, "A escolha � invalida");
		}
		
	}
	
	void volta(){
		int escol;
		do{
			escol = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja fazer outra opera��o: \n1-sim \n2-n�o"));
			if (escol == 1){
				menu();
			}
		}while(escol == 1) ;
	}
}
