import javax.swing.JOptionPane;

public class instru�oes08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "idade:"));
		if (idade <= 5)
			JOptionPane.showMessageDialog(null, "isento de pagamento");
		else 
			if (idade <= 12)
				JOptionPane.showMessageDialog(null, "bilhete crian�a");
			else 
				if (idade <= 65)
					JOptionPane.showMessageDialog(null, "bilhete normal");
				else 
					JOptionPane.showMessageDialog(null, "bilhete 3� idade");
				

	}

}
