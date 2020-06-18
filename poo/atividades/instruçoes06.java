import javax.swing.JOptionPane;

public class instruçoes06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes,dias_mes;
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "introduza o mes (1-12):"));
		if (mes >= 1 && mes <= 12){
			switch (mes){
			case 1: dias_mes = 31;
			break;
			case 2: dias_mes = 28;
			break;
			case 3: dias_mes = 31;
			break;
			case 4: dias_mes = 30;
			break;
			case 5: dias_mes = 31;
			break;
			case 6: dias_mes = 30;
			break;
			case 7: dias_mes = 31;
			break;
			case 8: dias_mes = 31;
			break;
			case 9: dias_mes = 30;
			break;
			case 10: dias_mes = 31;
			break;
			case 11: dias_mes = 30;
			break;
			case 12: dias_mes = 31;
			break;
			default: dias_mes = 0;
			}
			JOptionPane.showMessageDialog(null, "esse mes tem "+ dias_mes +"dias.");
		}
		else{
			JOptionPane.showMessageDialog(null, "mes invalido!!!");
		}

	}

}
