import javax.swing.JOptionPane;

public class instruçoes04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,maximo=0,minimo=0,soma=0;
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "quantos valores sao?"));
		for(int i = 1; i <= n; i++){
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o "+i+"º: "));
			soma +=x;
			if (i == 1 || x > maximo){
				maximo = x;
			}
			if (i == 1|| x < minimo){
				minimo = x;
			}
		}
		if (n > 0){
			JOptionPane.showMessageDialog(null, "maximo: " + maximo);
			JOptionPane.showMessageDialog(null, "minimo: " + minimo);
			JOptionPane.showMessageDialog(null, "soma: " + soma);
			JOptionPane.showMessageDialog(null, "media: " + soma/n);
		}

	}

}
