import javax.swing.JOptionPane;

public class instruçoes07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		String estacao;
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "introduza o mes (1-12):"));
		if (mes == 12|| mes == 1||mes == 2){
			estacao = "inverno";
		}
		else if (mes == 3|| mes == 4|| mes == 5){
				estacao = "primavera";
			
		}else if (mes == 6||mes == 7||mes == 8){
			estacao = "verao";
		}else if (mes == 9||mes == 10 || mes == 11){
			estacao = "outono";
		}else {
			estacao = "mes desconhecido";
		}
		JOptionPane.showMessageDialog(null, "o mês "+ mes + "está no(a) "+estacao+".");

	}

}
