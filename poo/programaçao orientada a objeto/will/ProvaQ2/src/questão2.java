import javax.swing.JOptionPane;

public class automovel {
	int modelo;
	String cor;
	int combustivel;
	
	int precocombus(){
		int preco=0;
		switch (combustivel){
			case 1:
				preco = 12000;
				break;
			case 2:
				preco = 10500;
				break;
			case 3:
				preco = 20000;
				break;
			case 4:
				preco = 13000;
				break;
		}
		return preco;
	}
	
	int model(){
		return modelo;
	}
	
	String cor(){
		return cor;
	}

	String nomcombus(){
		String nomecombus="";
		switch(combustivel){
			case 1:
				nomecombus = "Gasolina";
				break;
			case 2:
				nomecombus = "�lcool";
				break;
			case 3:
				nomecombus = "Diesel";
				break;
			case 4:
				nomecombus = "G�s";
				break;
		}		
		return nomecombus;
	}
	
	void imprimir(){
		JOptionPane.showMessageDialog(null,"Modelo:"+model()+"\nPre�o:R$"+precocombus()+"\nCor:"+cor()+"\nCombust�vel:"+nomcombus());
	}
	
}
