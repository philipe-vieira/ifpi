import javax.swing.JOptionPane;

public class instru�oes05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l1,l2,l3;
		l1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduza o lado 1: "));
		l2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduza o lado 2: "));
		l3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduza o lado 3: "));
		if (l1 == l2){
			if (l2 == l3){
				JOptionPane.showMessageDialog(null, "o triangulo � equilatero");
			}
			else {
				JOptionPane.showMessageDialog(null, "o triangulo � isoceles");
			}
		}
		else {
			if (l1 == l3){
				JOptionPane.showMessageDialog(null, "o triangulo � isoceles");
			}
			else{
				JOptionPane.showMessageDialog(null, "o triangulo � escaleno");
			}
		}

	}

}
