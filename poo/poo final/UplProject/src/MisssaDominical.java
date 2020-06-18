import javax.swing.JOptionPane;

public class MisssaDominical extends missa{
	String Cordeiro, Amem, SantisTrindade;
	
	public void inserir(){
		int dowhile;
		do{
			EntradaSacer = JOptionPane.showInputDialog("Canto de entrada: ");
			SantisTrindade = JOptionPane.showInputDialog("Santissima trindade: ");
			ato= JOptionPane.showInputDialog("Ato Penitencial: ");  
			HinoDeLouvor = JOptionPane.showInputDialog("Hino de louvor: ");
			salmo= JOptionPane.showInputDialog("Salmo Responsorial:"); 
			aclamacao= JOptionPane.showInputDialog("Canto de aclamacao: ");
			Ofertorio= JOptionPane.showInputDialog("Canto de ofertorio:");
			Santo= JOptionPane.showInputDialog("Santo:");
			AbracoDaPaz = JOptionPane.showInputDialog("Abraco da paz:");
			Cordeiro = JOptionPane.showInputDialog("Cordeiro:");
			Amem= JOptionPane.showInputDialog("Amem: "); 
			Comunhao= JOptionPane.showInputDialog("Canto de Comunhao:");
			PosComunhao= JOptionPane.showInputDialog("Canto de Pos Comunhao:");
			Final= JOptionPane.showInputDialog("Canto final:");
			dowhile = JOptionPane.showConfirmDialog(null, "Confirmar repertório de musicas?"
					+imprimirLista());
		}while(dowhile != 0);
	}
	
	String EntradaSacer(){
		if(EntradaSacer != null){ 
			return "Canto de entrada: "+EntradaSacer;
		}else{
			return "";
		}
	}
	String SantisTrindade(){
		if(SantisTrindade != null){ 
			return "Santissima trindade: "+SantisTrindade;
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
	String Cordeiro(){
		if(Cordeiro != null){
			return "Cordeiro: "+Cordeiro;
		}else{
			return "";
		}
	}
	String Amem(){
		if(Amem != null){ 
			return "Amem: "+Amem;
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
		return "\n"+EntradaSacer()+"\n"+SantisTrindade()+"\n"+ato()+"\n"+HinoDeLouvor()+
				"\n"+salmo()+"\n"+aclamacao()+"\n"+Ofertorio()+
				"\n"+Santo()+"\n"+AbracoDaPaz()+"\n"+Cordeiro()+
				"\n"+Amem()+"\n"+Comunhao()+
				"\n"+PosComunhao()+"\n"+Final();
		
	}

}
