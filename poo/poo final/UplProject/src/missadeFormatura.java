import javax.swing.JOptionPane;

public class missadeFormatura extends missa implements calcular{
	String BencaoAneis,	EntradaForm;
	double Preco = 200;

	public void inserir(){
		int dowhile;
		do{
			EntradaForm = JOptionPane.showInputDialog("Canto de entrada dos formandos: ");
			EntradaSacer = JOptionPane.showInputDialog("Canto de entrada do sacerdote: ");
			ato= JOptionPane.showInputDialog("Ato Penitencial: ");  
			HinoDeLouvor = JOptionPane.showInputDialog("Hino de louvor: ");
			salmo= JOptionPane.showInputDialog("Salmo Responsorial:"); 
			aclamacao= JOptionPane.showInputDialog("Canto de aclamacao: ");
			Ofertorio= JOptionPane.showInputDialog("Canto de ofertorio:");
			Santo= JOptionPane.showInputDialog("Santo:");
			AbracoDaPaz = JOptionPane.showInputDialog("Abraco da paz:");
			Comunhao= JOptionPane.showInputDialog("Canto de Comunhao:");
			PosComunhao= JOptionPane.showInputDialog("Canto de Pos Comunhao:");
			BencaoAneis = JOptionPane.showInputDialog("Canto de benção dos aneis: ");
			Final= JOptionPane.showInputDialog("Canto final:");
			dowhile = JOptionPane.showConfirmDialog(null, "Confirmar repertório de musicas?"
					+imprimirLista());
		}while(dowhile != 0);
	}
	
	String EntradaForm(){
		if(EntradaForm != null){
			return "Canto de entrada dos formandos: "+EntradaForm;
		}else{
			return "";
		}
	}
	String EntradaSacer(){
		if(EntradaSacer != null){
			return "Canto de entrada do sacerdote: "+EntradaSacer;
		}else{
			return "";
		}
	}
	String ato (){
		if(ato != null){ 
			return "Ato Penitencial: "+ato;
		}else{
			return "";
		}
	}
	String HinoDeLouvor(){
		if(HinoDeLouvor != null){ 
			return "Hino de louvor: "+HinoDeLouvor;
		}else{
			return "";
		}

	}
	String salmo(){
		if(salmo != null){ 
			return "Salmo Responsorial: "+salmo;
		}else{
			return "";
		}
	}
	String aclamacao(){
		if(aclamacao != null){ 
			return "Canto de aclamacao: "+aclamacao;
		}else{
			return "";
		}
	}
	String Ofertorio(){
		if(Ofertorio != null){ 
			return "Canto de ofertorio: "+Ofertorio;
		}else{
			return "";
		}
	}
	String Santo(){
		if(Santo != null){
			return "Santo: "+Santo;
		}else{
			return "";
		}
	}
	String AbracoDaPaz(){
		if(AbracoDaPaz != null){ 
			return "Abraco da paz: "+AbracoDaPaz;
		}else{
			return "";
		}
	}
	String Comunhao(){
		if(Comunhao != null){
			return "Canto de Comunhao: "+Comunhao;
		}else{
			return "";
		}
	}
	String PosComunhao(){
		if(PosComunhao != null){
			return "Canto de Pos Comunhao: "+PosComunhao;
		}else{
			return "";
		}
	}
	String BencaoAneis(){
		if(BencaoAneis != null){
			return "Canto de benção dos aneis: "+BencaoAneis;
		}else{
			return "";
		}
	}
	String Final(){
		if(Final != null){
			return "Canto final: "+Final;
		}else{
			return "";
		}
	}

	@Override
	String imprimirLista() {
		// TODO Auto-generated method stub
		return "\n"+EntradaSacer()+"\n"+ato()+"\n"+HinoDeLouvor()+
				"\n"+salmo()+"\n"+aclamacao()+"\n"+Ofertorio()+
				"\n"+Santo()+"\n"+AbracoDaPaz()+"\n"+Comunhao()+
				"\n"+PosComunhao()+"\n"+Final();
	}

	@Override
	public double calcularpreço() {
		return Preco;
	}


}
