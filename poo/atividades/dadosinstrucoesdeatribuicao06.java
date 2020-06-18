import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		double raio,perimetro;
		raio = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o raio da circunferencia: "));
		perimetro = 2 * pi * raio;
		JOptionPane.showMessageDialog(null, "o perimetro eh : " + perimetro);

	}

}
