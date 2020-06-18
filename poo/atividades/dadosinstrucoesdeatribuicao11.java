import javax.swing.JOptionPane;

public class dadosinstrucoesdeatribuicao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalseg,seg,segundo,minutos,hora;
		totalseg = Integer.parseInt(JOptionPane.showInputDialog(null, "digite os segundos: "));
		hora = totalseg / 3600;
		seg = totalseg % 3600;
		minutos = (totalseg % 3600)/60;
		segundo = seg % 60;
		JOptionPane.showMessageDialog(null, "os segundos sao iguais a "+ hora +" horas, " + minutos +"minutos, "+ segundo +"segundos." );
		
		

	}

}
