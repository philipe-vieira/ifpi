import javax.swing.JOptionPane;

public class cadastrar {
	dadosUsuario dados = new dadosUsuario();
	public void novasenha(){
		
		int resp;
		do{ 
			String senha, confirm;

			senha = JOptionPane.showInputDialog(null, "Digite sua senha: ", 
					"MINIMO: 8 caracteres, letras e numeros");
			confirm = JOptionPane.showInputDialog(null, "Comfirme sua senha: ");
				if (senha.equalsIgnoreCase(confirm)){
					resp = 1;
					dados.setId(dados.newId());
					dados.setSenha(senha);
					
					if ((senha != null)&&(confirm != null)){
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
						
						JOptionPane.showMessageDialog(null, "Estas informaçoes serão usadas para fazer login no sistema!"
								+ "\n\n\nNumero de id: "+dados.getId()+
								"\nSenha: "+dados.getSenha());
						}
				
				}else {
					JOptionPane.showMessageDialog(null, "Senha inválida!");
					resp = 0;
				}
				
		}while (resp != 1);
	}
	
	public void main() {
		String nome, cpf;
		int i;
		do{
			nome = JOptionPane.showInputDialog(null, "Nome Completo: ", "João Santos Sousa...");	
			dados.setNome(nome);
			cpf = JOptionPane.showInputDialog(null, "CPF: ", "ex: 12345678912");
			dados.setCpf(cpf);
			
			String bairro,rua, cidade,estado;
			int numero, CEP;
			
			bairro = JOptionPane.showInputDialog(null, "Bairro: ",null , JOptionPane.PLAIN_MESSAGE);
			dados.setBairro(bairro);
			rua = JOptionPane.showInputDialog(null, "Rua: ",null , JOptionPane.PLAIN_MESSAGE);
			dados.setRua(rua);
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: ",null , JOptionPane.PLAIN_MESSAGE));
			dados.setNumero(numero);
			CEP = Integer.parseInt(JOptionPane.showInputDialog(null, "CEP: ",null , JOptionPane.PLAIN_MESSAGE));
			dados.setCEP(CEP);
			cidade = JOptionPane.showInputDialog(null, "Cidade: ",null , JOptionPane.PLAIN_MESSAGE);
			dados.setCidade(cidade);
			//Object[] item;
			estado = (String) JOptionPane.showInputDialog(null, "UF: ",  "estado", JOptionPane.PLAIN_MESSAGE, 
					null, new Object[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", 
				"MS", "MT", "PA", "PB", "PE", "PI", "PR"
				, "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}, "AC");
			dados.setEstado(estado);
			
			int dialogButton = JOptionPane.YES_NO_OPTION;
			i = JOptionPane.showConfirmDialog(null, "Nome: "+dados.getNome()+"\nCPF: "+dados.getCpf()+
					"\n\n	Endereço: " 
					+"\n"+dados.imprimir(), estado, dialogButton);
		}while(i != 0);
		
		int num = JOptionPane.showConfirmDialog(null, "Você é integrante ou deseja fazer parte do nosso grupo? ");
		//System.out.println(num);
		if (num == 0){
			
			String intrumento = JOptionPane.showInputDialog(null, "Qual seu instrumento?", 
					"Digite o instrumento.", JOptionPane.PLAIN_MESSAGE);
			dados.setIntrumento(intrumento);
			novasenha();
		}else if(num == 1){
			novasenha();
		}else {
			System.exit(0);
		}
	}
	
}