import javax.swing.JOptionPane;

public class inicializaçao extends cadastrar{
	//login log = new login();
	
	public void inicia(){
	JOptionPane.showMessageDialog(null, "Seja Bem-vindo(a)! "
			+ "\nPaz e bem!!!" 
			+"\nO ministério de música Unidos Para Louvar da Matriz de São José, agradece á sua preferência.",
			null , JOptionPane.INFORMATION_MESSAGE);
	}
	public void escolha(){
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada: "
				+ "\n1- Login;"
				+ "\n2- Cadastro.", null, JOptionPane.QUESTION_MESSAGE));
		if ((op == 1)||(op == 2)||(op == 3)){
		switch(op){
		case 1:
			System.out.println(dados.getId()+"\n\n"+dados.getSenha());
			login log = new login(dados.getId(), dados.getSenha());
			break;
		case 2:
			main();
			    
			break;
		}
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		}
		
	}

}

