import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		num = Float.parseFloat(JOptionPane.showInputDialog(null, "digite o numero"));
		if (num != 0){
			System.out.println("o inverso do numero eh igual a:" + 1/num);
		}
		else {
			System.out.println("numero invalido!!!");
		}
		
			

	}

}
