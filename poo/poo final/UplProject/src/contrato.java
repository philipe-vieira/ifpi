import javax.swing.JOptionPane;

public class contrato{
	endereço local = new endereço();
	String nomeLocal;
	int dowhile;
	double preco;
	

	public double calcularpreço(double valor) {
		// TODO Auto-generated method stub
		preco = preco + valor;
		return preco;
	}
	
	public void inserir(){
		String bairro,rua, cidade,estado;
		
		int numero, CEP;
		
		bairro = JOptionPane.showInputDialog(null, "Bairro: ", "Endereço do contrato.", JOptionPane.PLAIN_MESSAGE);
		local.setBairro(bairro);
		rua = JOptionPane.showInputDialog(null, "Rua: ","Endereço do contrato." , JOptionPane.PLAIN_MESSAGE);
		local.setRua(rua);
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: ","Endereço do contrato.",
				JOptionPane.PLAIN_MESSAGE));
		local.setNumero(numero);
		CEP = Integer.parseInt(JOptionPane.showInputDialog(null, "CEP: ","Endereço do contrato." , 
				JOptionPane.PLAIN_MESSAGE));
		local.setCEP(CEP);
		cidade = JOptionPane.showInputDialog(null, "Cidade: ","Endereço do contrato.", JOptionPane.PLAIN_MESSAGE);
		local.setCidade(cidade);
		estado = (String) JOptionPane.showInputDialog(null, "UF: ", "Endereço do contrato.",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "AC", "AL", "AM", 
		        		"AP", "BA", "CE", "DF", "ES", "GO", "MA",
						"MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR"
						, "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}, "AC");
		local.setEstado(estado);
		nomeLocal = JOptionPane.showInputDialog(null, "Nome do local: ","Endereço do contrato.", 
				JOptionPane.PLAIN_MESSAGE);
	}
	public void contratar(){
		do{
			int op;
			String opin = (String)JOptionPane.showInputDialog(null, 
					"Escolha a opção de contrato desejada: ", null, JOptionPane.QUESTION_MESSAGE,
					null, new Object[] {"Louvor","Missa","Novena","Adoracao","Eventos"}, 1);
			if (opin.equals("Louvor")){
				op = 1;
			} else if (opin.equals("Missa")){
				op = 2;
			}else if (opin.equals("Novena")){
				op = 3;
			}else if (opin.equals("Adoracao")){
				op = 4;
			}else if (opin.equals("Eventos")){
				op = 5;
			}else {
				op = 0;
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
			switch(op){
			case 1:
				louvor louvor= new louvor();
				louvor.inserirlouvor();
				if((local.getBairro() == null)||(local.getCidade() == null)||
						(local.getRua() == null)){
					inserir();
				}
				calcularpreço(louvor.calcularpreço());
				break;
			case 2:
				int oq;
				String oqin= (String)JOptionPane.showInputDialog(null, 
						"Escolha o tipo de missa desejada:", "Tipo de missa", JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {"1- Missa com intencao"
								, "2- Missa de falecimento"
								, "3- Missa especial"
								, "4- Missa dominical"
								, "5- Missa de casamento"
								, "6- Missa de formatura"}, "1- Missa com intencao");
				if (oqin.equals("1- Missa com intencao")){
					oq = 1;
				} else if (oqin.equals("2- Missa de falecimento")){
					oq = 2;
				}else if (oqin.equals("3- Missa especial")){
					oq = 3;
				}else if (oqin.equals("4- Missa dominical")){
					oq = 4;
				}else if (oqin.equals("5- Missa de casamento")){
					oq = 5;
				}else if (oqin.equals("6- Missa de formatura")){
					oq = 6;
				}else {
					oq = 0;
					JOptionPane.showMessageDialog(null, "Opção invalida!");
				}
				switch (oq) {
				case 1:
					MissacomIntencao intencao = new MissacomIntencao();
					int show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						intencao.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}

					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(intencao.calcularpreço());
					break;
				case 2:
					MissadeFalecimento falecimento = new MissadeFalecimento();
					show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						falecimento.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}

					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(falecimento.calcularpreço());
					break;
				case 3:
					Missaespecial especial = new Missaespecial();
					show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						especial.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}

					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(especial.calcularpreço());
					break;
				case 4:
					MisssaDominical dominical = new MisssaDominical();
					show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						dominical.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}

					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(0.0);
					break;
				case 5:
					missadeCasamento casamento = new missadeCasamento();
					show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						casamento.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}

					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(casamento.calcularpreço());
					break;
				case 6:
					missadeFormatura formatura = new missadeFormatura();
					show = JOptionPane.showConfirmDialog(null, 
							"Deseja enviar a lista musical agora?");
					if (show == 0){
						formatura.inserir();
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					} else{
						JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
								+ "\n	Segue abaixo o email para contato:"
								+ "\n\n\n\nEmail: upl2016@hotmail.com");
						if((local.getBairro() == null)||(local.getCidade() == null)||
								(local.getRua() == null)){
							inserir();
						}
					}
					calcularpreço(formatura.preco);

					break;
	
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!", null, JOptionPane.ERROR_MESSAGE);
					break;
				}
				break;
			case 3:
				novena novena = new novena();
				int show = JOptionPane.showConfirmDialog(null, 
						"Deseja enviar a lista de musicas agora?");
				if (show == 0){
					novena.inserir();
					if((local.getBairro() == null)||(local.getCidade() == null)||
							(local.getRua() == null)){
						inserir();
					}
				} else{
					JOptionPane.showMessageDialog(null, "Voce pode nos enviar as musias por email!"
							+ "\n	Segue abaixo o email para contato:"
							+ "\n\n\n\nEmail: upl2016@hotmail.com");
					if((local.getBairro() == null)||(local.getCidade() == null)||
							(local.getRua() == null)){
						inserir();
					}
				}
				calcularpreço(novena.preco);
				break;
			case 4:
				adoracao adoracao= new adoracao();
				adoracao.inseriradoracao();
				if((local.getBairro() == null)||(local.getCidade() == null)||
						(local.getRua() == null)){
					inserir();
				}
				calcularpreço(adoracao.calcularpreço());
				break;
			case 5:
				eventos evento = new eventos();
				int resp = JOptionPane.showConfirmDialog(null,"O evento acontecerá na Paróquia matriz?"
						);
				if (resp == 0){
					evento.inserirevento();
				}else if(resp == 1){
					if((local.getBairro() == null)||(local.getCidade() == null)||
							(local.getRua() == null)){
						inserir();
					}
					evento.inserirevento(local);
				}else{
					System.exit(0);
				}
				calcularpreço(evento.calcularpreço());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
			
			dowhile = JOptionPane.showConfirmDialog(null, 
					"Deseja adicionar outro contrato a este?");
		}while(dowhile == 0);
		JOptionPane.showMessageDialog(null, "O preço total do contrato é igual a R$ "
		+preco, "Preço total", JOptionPane.INFORMATION_MESSAGE, null);
	}
}