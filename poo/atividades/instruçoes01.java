import javax.swing.JOptionPane;

public class instruçoes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		nota = Integer.parseInt(JOptionPane.showInputDialog(null, "qual é a nota?"));
		switch (nota){
		case 1: JOptionPane.showMessageDialog(null, "mau");
		break;
		case 2: JOptionPane.showMessageDialog(null, "mediocre");
		break;
		case 3: JOptionPane.showMessageDialog(null, "suficiente");
		break;
		case 4: JOptionPane.showMessageDialog(null, "bom");
		break;
		case 5: JOptionPane.showMessageDialog(null, "excelente");
		break;
		default: JOptionPane.showMessageDialog(null, "nota invalida!!!");
		}

	}

}
