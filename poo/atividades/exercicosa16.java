import javax.swing.JOptionPane;

public class exercicosa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,soma = 0,digito;
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um numero maior que 0:"));
		while (num > 0){
			digito = (int) num % 10;
			num = num / 10;
			if (digito % 2 == 0){
				soma = soma + digito;
			}
			
		}
		JOptionPane.showMessageDialog(null, "soma = "+ soma);

	}

}
