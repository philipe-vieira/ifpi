import javax.swing.JOptionPane;

public class missadeCasamento extends missa implements calcular{
	String EntPais,
	EntPadrinhos,
	EntAliancas,
	EntNoivo,
	EntNoiva;
	double preco = 200;
	
	public void inserir(){
		int dowhile;
		do{
			EntPais= JOptionPane.showInputDialog("Canto de entrada dos pais: ");
			EntPadrinhos= JOptionPane.showInputDialog("Canto de entrada dos padrinhos: ");
			EntAliancas= JOptionPane.showInputDialog("Canto de entrada dao alianças: ");
			EntNoivo = JOptionPane.showInputDialog("Canto de entrada do Noivo: ");
			EntNoiva = JOptionPane.showInputDialog("Canto de entrada da Noiva: ");
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
			Final= JOptionPane.showInputDialog("Canto final:");
			dowhile = JOptionPane.showConfirmDialog(null, "Confirmar repertório de musicas?"
					+imprimirLista());
		}while(dowhile != 0);
	}
	
	String EntPais(){
		if(EntPais != null){
			return "Canto de entrada 1: "+EntPais;
		}else{
			return "";
		}
	}
	String EntPadrinhos(){
		if(EntPadrinhos != null){
			return "Canto de entrada 2: "+EntPadrinhos;
		}else{
			return "";
		}
	}
	String EntAliancas(){
		if(EntAliancas != null){ 
			return "Canto de entrada 3: "+EntAliancas;
		}else{
			return "";
		}
	}
	String EntNoivo(){
		if(EntNoivo != null){
			return "Canto de entrada 4: "+EntNoivo;
		}else{
			return "";
		}
	}
	String EntNoiva(){
		if(EntNoiva != null){
			return "Canto de entrada 5: "+EntNoiva;
		}else{
			return "";
		}
	}
	String EntradaSacer(){
		if(EntradaSacer != null){ 
			return "Canto de entrada 6: "+EntradaSacer;
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
		return "\n"+EntPais()+"\n"+EntPadrinhos()+"\n"+EntAliancas()+
				"\n"+EntNoivo()+"\n"+EntNoiva()+
				"\n"+EntradaSacer()+"\n"+ato()+"\n"+HinoDeLouvor()+
				"\n"+salmo()+"\n"+aclamacao()+"\n"+Ofertorio()+
				"\n"+Santo()+"\n"+AbracoDaPaz()+"\n"+Comunhao()+
				"\n"+PosComunhao()+"\n"+Final();
		
	}

	@Override
	public double calcularpreço() {
		// TODO Auto-generated method stub
		return preco;
	}

}
