package prova01;

import javax.swing.JOptionPane;

public class pessoa {
	String nome, sexo;
	int RG, Ano_Nasc;
	
	void inserir(){
		nome = JOptionPane.showInputDialog("Insira seu Nome da pessoa: ");
		sexo = JOptionPane.showInputDialog("Insira seu Sexo da pessoa: ");
		RG = Integer.parseInt(JOptionPane.showInputDialog("Insira seu RG da pessoa: "));
		Ano_Nasc = Integer.parseInt(JOptionPane.showInputDialog("Insira seu Ano de Nascimento da pessoa: "));
	}
	
	String imprimirnome(){
		JOptionPane.showMessageDialog(null, "Nome: "+nome);
		return nome;
	}
	String imprimirsexo(){
		JOptionPane.showMessageDialog(null, "Sexo: "+sexo);
		return sexo;
	}
	int imprimirrg(){
		JOptionPane.showMessageDialog(null, "RG: "+RG);
		return RG;
	}
	int imprimirAnoNasc(){
		JOptionPane.showMessageDialog(null, "Ano de Nascimento: "+Ano_Nasc);
		return Ano_Nasc;
	}
	
	void imprimir_masculino(){
		if(sexo.equals("masculino")){
		JOptionPane.showMessageDialog(null, "Informa��es da(s) pessoa(s) do sexo Masculino s�o:");
		JOptionPane.showMessageDialog(null, "Nome: "+nome);
		JOptionPane.showMessageDialog(null, "Sexo: "+sexo);
		JOptionPane.showMessageDialog(null, "RG: "+RG);
		JOptionPane.showMessageDialog(null, "Ano de Nascimento: "+Ano_Nasc);
		}
	}
	void imprimir_velho(){
			JOptionPane.showMessageDialog(null, "O mais velho �:");
			JOptionPane.showMessageDialog(null, "Nome: "+nome);
			JOptionPane.showMessageDialog(null, "Sexo: "+sexo);
			JOptionPane.showMessageDialog(null, "RG: "+RG);
			JOptionPane.showMessageDialog(null, "Ano de Nascimento: "+Ano_Nasc);
	}
}