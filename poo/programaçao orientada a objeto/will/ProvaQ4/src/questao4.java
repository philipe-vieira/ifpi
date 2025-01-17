import javax.swing.JOptionPane;

public class Conta {
	int num;
	String nome;
	int tipoconta;
	double saldo;
	
	void entrada(){
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da conta:"));
		nome = JOptionPane.showInputDialog("Digite o nome do titula da conta");
		tipoconta = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da conta[1-Poupan�a;2-Conta Corrente]:"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta:"));
	}
	
	double depositar(){
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor � depositar:"));
		this.saldo+=valor;
		JOptionPane.showMessageDialog(null,"Dep�sito realizado com sucesso!");
		imprimir();
		return saldo;
	}
	
	double sacar(){
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor � sacar:"));
		if(saldo-valor<0)
			JOptionPane.showMessageDialog(null,"N�o � possivel realizar a opera��o. Saldo ficar� negativado!");
		else{
			this.saldo-=valor;
			JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
		}
		imprimir();
		return saldo;
	}
	
	double consulta(){
		return saldo;
	}
	
	void imprimir(){
		String nomec="";
		int resp=0;
		if(tipoconta==1)
			nomec="Poupan�a";
		else
			if(tipoconta==2)
				nomec="Conta corrente";
		
		JOptionPane.showMessageDialog(null,"N�mero da conta:"+num+"\nNome do titular:"+nome+"\nTipo da conta:"+nomec+"\nSaldo:R$"+saldo);
		resp = Integer.parseInt(JOptionPane.showInputDialog("Voc� quer voltar ao menu?[1-SIM;2-N�O]"));
		if(resp==1)
			menu();
	}
	
	void menu(){
		int resp=Integer.parseInt(JOptionPane.showInputDialog("MENU:\n1-Realizar dep�sito\n2-Realizar saque\n3-Mostrar saldo\n4-Mostrar informa��es do titular"));
		switch (resp){
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Seu saldo �:R$"+consulta());
				break;
			case 4:
				imprimir();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida!");
				menu();
				break;
		}
	}
	
	
}
