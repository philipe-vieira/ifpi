import javax.swing.JOptionPane;

public class calculadora {
	private int x,y;
	
	void entrada(){
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para Y"));
	}
	
	int soma(){
		return x+y;
	}
	
	int subtrair(){
		return x-y;
	}
	
	int multiplicar(){
		return x*y;
	}
	
	int dividir(){
		int cont=0;
		if(x!=0)
			cont=x/y;
		else
			JOptionPane.showMessageDialog(null,"Impossivel realizar a opera��o!!!");
		return cont;
	}
	
	void imprimir(){
		JOptionPane.showMessageDialog(null, "Soma:"+soma()+"\nSubtra��o:"+subtrair()+"\nMultiplica��o:"+multiplicar()+"\nDivis�o:"+dividir());
	}
	
}
