import javax.swing.JOptionPane;

public class exercicosa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for (int i=100;i<=10000;i++){
				if (i%5 == 0){
					if (i%3 != 0){
						JOptionPane.showMessageDialog(null, "o numero " + i + "eh multiplo de 5 e nao de 3.");
						
					}
				}
				
			}
			

	}

}
