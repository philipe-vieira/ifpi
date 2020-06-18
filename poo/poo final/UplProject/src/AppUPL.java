import javax.swing.JOptionPane;

public class AppUPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicializaçao i = new inicializaçao();
		i.inicia();
		int num;
		do{
			i.escolha();
			num = JOptionPane.showConfirmDialog(null, "deseja realizar outra operação? ");
			//System.out.println(num);
			if (num == 1){
				JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!!!");
			}else if(num == 2){
				break;
			}
		}while(num == 0);

	}

}