import javax.swing.JOptionPane;

public class instru�oes02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o primeiro numero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o segundo numero:"));
		if (num1%2==0){
			if (num2%2==0){
				JOptionPane.showMessageDialog(null, "ambos sao pares.Resultado = "+(num1+num2));
			}
			else{
				JOptionPane.showMessageDialog(null, "o 1� � par e o 2� � impar = "+num2);
			}
		}
		else {
			if (num2%2!=0){
				JOptionPane.showMessageDialog(null, "ambos sao impares.Resultado = "+(num1*num2));
			}
			else {
				JOptionPane.showMessageDialog(null, "o 1� � impar e o 2� � par.Resultado = "+num1);
			}
		}

	}

}
