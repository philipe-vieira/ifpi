import javax.swing.JOptionPane;

public class testaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = JOptionPane.showInputDialog(null,"Digite o nome da primeira pessoa:");
		p1.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento da primeira pessoa :"));
		p1.sexo = JOptionPane.showInputDialog("Digite o sexo da primeira pessoa:");
		p2.nome = JOptionPane.showInputDialog(null,"Digite o nome da segunda pessoa:");
		p2.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento da segunda pessoa:"));
		p2.sexo = JOptionPane.showInputDialog("Digite o sexo da segunda pessoa:");
		
		if(p1.sexo=="masculino"){
			JOptionPane.showMessageDialog(null,p1.nome+"é masculino!");
			p1.imprimir();
		}
		else
			if(p2.sexo=="masculino"){
				JOptionPane.showMessageDialog(null,p2.nome+"é masculino!");
				p2.imprimir();
			}
		else
		    if(p1.ano<p2.ano){
			JOptionPane.showMessageDialog(null,p1.nome+" é mais velho!!");
			p1.imprimir();
		    }
		else
			if(p2.ano<p1.ano){
				JOptionPane.showMessageDialog(null,p2.nome" é mais velho!!");
				p2.imprimir();
			}
		
	}

}
