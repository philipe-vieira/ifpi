import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano;
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "qual é o ano?"));
		if (((ano % 4 == 0) &&(ano % 100 !=0))||(ano % 400 ==0)){
			JOptionPane.showMessageDialog(null, "o ano" + ano +"é bisexto");
		}
		else {
			JOptionPane.showMessageDialog(null, "o ano" + ano +"é comum");
		}

	}

}
