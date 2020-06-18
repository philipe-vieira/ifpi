import java.util.*;

import javax.swing.JOptionPane;

public class login extends cadastrar{
	
	login(int usuario, String senha){
		int valido = 0;
		do{
			int idusuario = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do usuario: "));
			String senhausuario = JOptionPane.showInputDialog("Digite a senha do usuario: ");


			if((usuario == idusuario)&&(senha.equals(senhausuario))){
				//dadosUsuario dados = new dadosUsuario();
				Date atualiza = new Date();
								
				JOptionPane.showMessageDialog(null, "Login de "+dados.getNome()+
						" realizado com sucesso! \nHora de login: "+atualiza, null, 
						JOptionPane.INFORMATION_MESSAGE);
								
				valido = 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "ID do usuario ou senha incorretos! ",
						null, JOptionPane.ERROR_MESSAGE);
				valido = 2;
			}
		}while(valido != 1);
		valido = JOptionPane.showConfirmDialog(null, "Deseja realizar contrato?");
		if (valido == 0){
			contrato contrato = new contrato();
			contrato.contratar();
		}else if(valido == 1){
			
		}else if((valido != 1)&&(valido != 0)){
			System.out.println(valido);
			System.exit(0);
		}
	}

}