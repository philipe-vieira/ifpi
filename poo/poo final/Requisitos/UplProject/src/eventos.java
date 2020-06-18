import javax.swing.JOptionPane;

public class eventos implements calcular{
	String tipo, descricao, duracao;
	louvor louvo = new louvor();
	boolean louvorEvent, passou;
	int botao = JOptionPane.YES_NO_OPTION;
	private double precoNAP = 70.0, precoFOR = 100.0;
	
	void inserirevento(){
		int dowhile;
		passou = true;
		do{
		tipo = JOptionPane.showInputDialog("Qual o tipo de evento?");
		descricao = JOptionPane.showInputDialog("Qual a descrição do evento?");
		duracao = JOptionPane.showInputDialog(null, "Qual a duraçao do evento?",
				"Duraçao do Evento.", JOptionPane.QUESTION_MESSAGE);
		int escolha = JOptionPane.showConfirmDialog(null, "No evento havera momento de louvor?");
		if (escolha == 0){
			louvorEvent = true;
			louvo.inserirlouvor();
		}else{
			louvorEvent = false;
		}
		dowhile = JOptionPane.showConfirmDialog(null, "Comfirmar as informaçoes abaixo?"
				+ "\nTipo de evento: "+tipo
				+"\nDescrição do evento: "+descricao
				+"\nDuraçao do evento: "+duracao,
				"Informações",JOptionPane.QUESTION_MESSAGE);
		if (dowhile == 0 )
			JOptionPane.showConfirmDialog(null, "Confirmar repertório de louvor?"+louvo.reperprincipal);
		
		}while(dowhile != 0);
		
	}
	void inserirevento(endereço endereco){
		int dowhile;
		passou = false;
		do{
		tipo = JOptionPane.showInputDialog("Qual o tipo de evento?");
		descricao = JOptionPane.showInputDialog("Qual a descrição do evento?");
		duracao = JOptionPane.showInputDialog(null, "Qual a duraçao do evento?",
				"Duraçao do Evento.", JOptionPane.QUESTION_MESSAGE);
		int escolha = JOptionPane.showConfirmDialog(null, "No evento havera momento de louvor?");
		if (escolha == 1){
			louvorEvent = true;
			louvo.inserirlouvor();
		}else{
			louvorEvent = false;
		}
		dowhile = JOptionPane.showConfirmDialog(null, "Comfirmar as informaçoes abaixo?"
				+ "\nTipo de evento: "+tipo
				+"\nDescrição do evento: "+descricao
				+"\nDuraçao do evento: "+duracao,
				"Informações",JOptionPane.QUESTION_MESSAGE, botao);
		if (dowhile == 0 ){
			JOptionPane.showConfirmDialog(null, "Confirmar Endereço?"
					+"\nRua: "+endereco.getRua()
					+"\nBairro: "+endereco.getBairro()
					+"\nNumero: "+endereco.getNumero()
					+"\nCEP: "+endereco.getCEP()
					+"\nCidade-UF: "+endereco.getCidade()+"-"+endereco.getUf());
			if (dowhile == 0 )
				JOptionPane.showConfirmDialog(null, "Confirmar repertório de louvor?"+louvo.reperprincipal);
		}
		}while(dowhile != 0);
	}
	
	double calcularpreçoNAP(){
		return precoNAP;
	}
	double calcularpreçoFOR(){
		return precoFOR;
	}
	
	@Override
	public double calcularpreço() {
		// TODO Auto-generated method stub
		if(passou == true){
			if(louvorEvent == true){
				return calcularpreçoNAP()+louvo.calcularpreço();
			}else {
				return calcularpreçoNAP();
			}
		}else{
			if(louvorEvent == true){
				return calcularpreçoNAP()+louvo.calcularpreço();
			}else {
				return calcularpreçoNAP();
			}
		}
	}
	
	String imprimir(){
		return ("\n\n		Informações: \nTipo de evento: " +tipo
				+"\nDuração: "+duracao+"\nDescrição: "+descricao);
	}

}

