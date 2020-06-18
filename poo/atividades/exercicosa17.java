import javax.swing.JOptionPane;

public class exercicosa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,somaa = 0;
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "introduza um numero positivo:"));
		if (num < 0){
			JOptionPane.showMessageDialog(null, "numero invalido!!!");
		}
		}while (num < 0);
		System.out.println("numero : " + num);
		
		for (int n=num;n>=0;n--){
			for (int i=1;i<=num;i++){
				if (num % i == 0){
					System.out.println("numero : " + i);
					somaa += i;
				}
				
			}
			System.out.println("soma = " +somaa);
			if (somaa == num){
				JOptionPane.showMessageDialog(null, num + " eh perfeito.");
				System.out.println(num + "eh perfeito");
			}
			somaa = 0;
		}
		

	}

}