package prova04;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cont = new Conta();
		
		cont.inserir();
		cont.menu();
		cont.volta();
		JOptionPane.showMessageDialog(null, "Obrigado por ser nosso Cliente.\n\n Volte Sempre \n\nCliente Bradesco Tem Sempre Mais Vantagem.");

	}

}
