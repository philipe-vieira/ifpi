import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o numero."));
		if (num % 2 == 0){
			JOptionPane.showMessageDialog(null, num + " eh par");
		}
		else {
			JOptionPane.showMessageDialog(null, num  + " eh impar");
		}

	}

}
