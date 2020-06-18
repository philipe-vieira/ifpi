import javax.swing.JOptionPane;

public class louvor implements calcular{
	String musica1 = "Nossa familia te acolhe",
		musica2 = "Flor minha flor, flor vem ca",
		musica3 ="Vem vem vem, espirito santo",
		musica4 ="Senhor eu quero obedecer",
		musica5 ="Vontade de Louvar",
		musica6 ="Alegria está no coração",
		musica7 ="Estou sentindo sua força agora",
		musica8 ="Quero louvar-te",
		musica9 ="Louvadeira do senhor",
		musica10 ="Pescador de cristo",
		musica11 ="História de Gomorra",
		musica12 ="Pipoca",
		musica13 ="O meu coração era de pedra",
		musica14 ="Agachadinho",
		musica15 ="Dança do esquisito",
		musica16 ="Quer louvar também",
		musica17 ="Homenzinho torto",
		musica18 ="Shandalá",
		musica19 ="O rei Davi",
		musica20 ="Tum tum tum de Deus",
		musica21 ="Sentinela da manhã",
		musica22 ="Deus é dez";

	private String repertorio1, repertorio2, repertorio3, repertorio4;
	String tempo, reperprincipal;
	double preco = 75;
	
	public String getRepertorio1() {
		return repertorio1;
	}
	public String getRepertorio2() {
		return repertorio2;
	}
	public String getRepertorio3() {
		return repertorio3;
	}
	public String getRepertorio4() {
		return repertorio4;
	}
	public void setRepertorio1(String repertorio1) {
		this.repertorio1 = ("1- "+musica1+"\n2- "+musica2+"\n3- "+musica3+"\n4- "+musica4+"\n5- "+musica5+"\n6- "+musica6+"\n7- "+musica7);
	}
	public void setRepertorio2(String repertorio2) {
		this.repertorio2 = ("1- "+musica1+"\n2- "+musica2+"\n3- "+musica3+"\n4- "+musica4+"\n5- "+musica5+"\n6- "+musica6+"\n7- "+musica7+
				"\n8- "+musica8+"\n9- "+musica9+"\n10- "+musica10+"\n11- "+musica11);
	}
	public void setRepertorio3(String repertorio3) {
		this.repertorio3 = ("1- "+musica1+"\n2- "+musica2+"\n3- "+musica3+"\n4- "+musica4+"\n5- "+musica5+"\n6- "+musica6+"\n7- "+musica7+
				"\n8- "+musica8+"\n9- "+musica9+"\n10- "+musica10+"\n11- "+musica11+"\n12- "+musica12+"\n13- "+musica13+"\n14- "+musica14+
				"\n15- "+musica15+"\n16- "+musica16);
	}
	public void setRepertorio4(String repertorio4) {
		this.repertorio4 = ("1- "+musica1+"\n2- "+musica2+"\n3- "+musica3+"\n4- "+musica4+"\n5- "+musica5+"\n6- "+musica6+"\n7- "+musica7+
				"\n8- "+musica8+"\n9- "+musica9+"\n10- "+musica10+"\n11- "+musica11+"\n12- "+musica12+"\n13- "+musica13+"\n14- "+musica14+
				"\n15- "+musica15+"\n16- "+musica16+"\n17- "+musica17+"\n18- "+musica18+"\n19- "+musica19+"\n20- "+musica20+
				"\n21- "+musica21+"\n22- "+musica22);
	} 

	String inserirlouvor(){
		String opção = (String) JOptionPane.showInputDialog(null, "Escolha a duraçao do louvor.", "Duraçao do louvor.",
		        JOptionPane.QUESTION_MESSAGE, null, new Object[] { "30min","1h","1h30min","2h" }
	 , "2h");
		switch(opção){
		case "30min":
			tempo = "30min";
			setRepertorio1(repertorio1);
			reperprincipal = getRepertorio1();
			break;
		case "1h":
			tempo = "1h";
			setRepertorio2(repertorio2);
			reperprincipal = getRepertorio2();
			break;
		case "1h30min":
			tempo = "1h30min";
			setRepertorio3(repertorio3);
			reperprincipal = getRepertorio3();
			break;
		case "2h":
			tempo = "2h";
			setRepertorio4(repertorio4);
			reperprincipal = getRepertorio4();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Tempo inválido.");
			break;
		}
		JOptionPane.showMessageDialog(null, "Musicas: \n"+reperprincipal);
		return reperprincipal;
	}

	@Override
	public double calcularpreço() {
		// TODO Auto-generated method stub
		if(tempo == "30min"){
			return preco/2;
		}else if(tempo == "1h"){
			return preco;
		}else if(tempo =="1h30min"){
			return preco+(preco/2);
		}else if(tempo == "2h"){
			return preco*2;
		}else{
			return 0;
		}
	}
}
