import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double cat1,cat2,hipo;
		cat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o cateto adjacente:"));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o cateto oposto:"));
		hipo = Math.sqrt(cat1 * cat1 + cat2 * cat2);
		JOptionPane.showMessageDialog(null, "hipotenusa = "+ hipo);
		System.out.println("hipotenusa = "+ hipo);
		

	}

}
