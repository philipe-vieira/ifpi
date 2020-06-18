import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Double raiz1,delt;
		Double raiz2 = null;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de a:"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de b:"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o valor de c:"));
		delt = (double) (b*b - 4*a*c);
		if (delt >= 0){
			raiz1 = (-b + Math.sqrt(delt))/(2*a);
			raiz1 = (-b - Math.sqrt(delt))/(2*a);
			JOptionPane.showMessageDialog(null, "a primeira raiz eh: "+raiz1);
			JOptionPane.showMessageDialog(null, "o valor da segunda raiz eh: " + raiz2);
			
		}
		else{
			JOptionPane.showMessageDialog(null, "a equacao nao tem raizes!!!");
		}

	}

}
