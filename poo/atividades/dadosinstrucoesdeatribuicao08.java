import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero: "));
		if (num > 0){
			JOptionPane.showMessageDialog(null, "o numero "+num+" eh positivo");
		}
		else {
			if (num < 0){
			JOptionPane.showMessageDialog(null, "o numero " + num + " eh negativo");}
			else {
				JOptionPane.showMessageDialog(null, "o numemo eh igual a 0");
			}
		}

	}

}
