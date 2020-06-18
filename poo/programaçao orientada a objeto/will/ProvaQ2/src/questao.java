import javax.swing.JOptionPane;

public class testaAutomovel {

	public static void main(String[] args) {
		automovel carro1    = new automovel();
		automovel carro2 = new automovel();
		
		carro1.modelo =Integer.parseInt(JOptionPane.showInputDialog("Digite o modelo do automóvel 1:"));
		carro1.cor = JOptionPane.showInputDialog("Digite a cor do automóvel 1:");
		carro1.combustivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o combustível[1-Gasolina;2-Álcool;3-Diesel;4-Gás] automóvel 1:"));
		carro2.modelo =Integer.parseInt(JOptionPane.showInputDialog("Digite o modelo automóvel 2:"));
		carro2.cor = JOptionPane.showInputDialog("Digite a cor automóvel 2:");
		carro2.combustivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o combustível[1-Gasolina;2-Álcool;3-Diesel;4-Gás]automóvel 2:"));
		
		if(carro1.precocombus()>carro2.precocombus())
			carro1.imprimir();
		else{
			if(carro2.precocombus()>carro1.precocombus())
				carro2.imprimir();
			else{
				carro1.imprimir();
				carro2.imprimir();
			}
		}
		
		
		
		//auto1.imprimir();
		//JOptionPane.showMessageDialog(null,"Preço:R$"+auto1.combus()+"\nModelo:"+auto1.model()+"\nCor:"+auto1.cor()+"\nCombustível:"+auto1.tipocombus());
		
		

	}

}
