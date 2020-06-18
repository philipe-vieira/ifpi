package prova01;

import javax.swing.JOptionPane;

public class Inserir_Dados {

	public static void main(String[] args) {
		pessoa pes1 = new pessoa();
		pessoa pes2 = new pessoa();
				
		JOptionPane.showMessageDialog(null, "Primeira Pessoa");
		pes1.inserir();
		
		JOptionPane.showMessageDialog(null, "Segunda Pessoa");
		pes2.inserir();
		
		JOptionPane.showMessageDialog(null, "Informações do primeiro:");
		pes1.imprimirnome();
		pes1.imprimirsexo();
		pes1.imprimirrg();
		pes1.imprimirAnoNasc();
		JOptionPane.showMessageDialog(null, "Informações do segundo:");
		pes2.imprimirnome();
		pes2.imprimirsexo();
		pes2.imprimirrg();
		pes2.imprimirAnoNasc();
		
		pes1.imprimir_masculino();
		pes2.imprimir_masculino();
		
		if(pes1.Ano_Nasc < pes2.Ano_Nasc){
		pes1.imprimir_velho();
		}
		else if(pes1.Ano_Nasc > pes2.Ano_Nasc){
		pes2.imprimir_velho();
		}
		else{
			JOptionPane.showMessageDialog(null, "Ambos são da Mesma idade:");
		}
	}

}