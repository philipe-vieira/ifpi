import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	String sexo;
	int rg;
	int ano_nasc;
	
	void entrada(){
		nome = JOptionPane.showInputDialog(null,"Digite o nome:");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
		sexo = JOptionPane.showInputDialog("Digite o sexo:");
		rg = Integer.parseInt(JOptionPane.showInputDialog("Digite seu rg:"));
	}
	
	int ano(){
		return ano;
	}
	
	String sex(){
		return sexo;
	}
	
	void imprimir(){
		JOptionPane.showMessageDialog(null,"Nome:"+nome+"\nAno de nascimento:"+ano+"\nSexo:"+sexo);
	}
	
}
