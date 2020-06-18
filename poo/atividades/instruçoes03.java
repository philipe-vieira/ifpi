import javax.swing.JOptionPane;

public class instruçoes03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aleat;
		int num;
		aleat = Math.random()*10;
		num = (int) aleat;
		if (num %2 == 0){
			JOptionPane.showMessageDialog(null, "saiu um numero par:" +num);
		}
		else {
			JOptionPane.showMessageDialog(null, "saiu um numero impar:" +num);
		}
		

	}

}
