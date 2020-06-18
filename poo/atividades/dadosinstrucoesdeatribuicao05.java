import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double volume,largura,comprimento;
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a altura: "));
		largura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a largura: "));
		comprimento = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a comprimento: "));
		volume = altura * largura * comprimento;
		JOptionPane.showMessageDialog(null, "o volume eh de: " + volume);
		System.out.print("o volume eh de: " + volume);

	}

}
