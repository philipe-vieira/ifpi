import javax.swing.JOptionPane;

public class adoracao implements calcular{
	String musica1 = "Vim Para Adorar-Te",
		musica2 ="Tu és Bom",
		musica3 ="Foi Por Amor",
		musica4 ="Me Rendo A Ti",
		musica5 ="Noites Traiçoeiras",
		musica6 ="Tudo O Que Sou",
		musica7 = "Em Tua Presença",
		musica8 ="Rede Ao Mar",
		musica9 ="Enquanto Eu Respirar",
		musica10 ="Eu Te Quero",
		musica11 ="Nosso Deus é Poderoso (god Is Able)",
		musica12 ="Águas Vivas",
		musica13 ="Elevo Os Meus Olhos",
		musica14 ="Eu Sou Teu",
		musica15 ="Fogo de Deus",
		musica16 ="Faz Chover",
		musica17 ="Estou Aqui Para Te Louvar",
		musica18 ="A Canção do Apocalipse",
		musica19 ="Geração Que Dança",
		musica20 ="Não Quero Viver Pra Mim Mesmo";

		private String repertorio1, repertorio2, repertorio3, repertorio4, repertorio5;

		String tempo, reperprincipal;
		double preco = 40;

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
		public String getRepertorio5() {
			return repertorio5;
		}
		public void setRepertorio1(String repertorio1) {
			this.repertorio1 = (musica1+"\n"+musica2+"\n"+musica3+"\n"+musica4+"\n"+musica5);
		}
		public void setRepertorio2(String repertorio2) {
			this.repertorio2 = (getRepertorio1()+"\n"+musica6+"\n"+musica7+"\n"+musica8+"\n"+musica9+"\n"+musica10);
		}
		public void setRepertorio3(String repertorio3) {
			this.repertorio3 = (getRepertorio1()+"\n"+getRepertorio2()+"\n"+musica11+"\n"+musica12+"\n"+musica13+"\n"+musica14+"\n"+musica15);
		}
		public void setRepertorio4(String repertorio4) {
			this.repertorio4 = (getRepertorio1()+"\n"+getRepertorio2()+"\n"+getRepertorio3()+"\n"+musica16+"\n"+musica17+"\n"+musica18+"\n"+musica19+"\n"+musica20);
		}
		public void setRepertorio5(String repertorio5) {
			this.repertorio5 = musica1+"\n"+musica2+"\n"+musica3;
		}

		String inseriradoracao(){
			String opção = (String) JOptionPane.showInputDialog(null, "escolha a duraçao do evento",
					"Duraçao do Evento.", JOptionPane.QUESTION_MESSAGE, null, 
					new Object[] { "30min","1h","2h","3h","4h" }, "30min");
			setRepertorio1(repertorio1);
			setRepertorio2(repertorio2);
			setRepertorio3(repertorio3);
			setRepertorio4(repertorio4);
			setRepertorio5(repertorio5);
			switch(opção){
			case "30min":
				tempo = "30min";
				reperprincipal = getRepertorio5();
				break;
			case "1h":
				tempo = "1h";
				reperprincipal = getRepertorio1();
				break;
			case "2h":
				tempo = "2h";
				reperprincipal = getRepertorio2();
				break;
			case "3h":
				tempo = "3h";
				reperprincipal = getRepertorio3();
				break;
			case "4h":
				tempo = "4h";
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
			}else if(tempo =="2h"){
				return preco*2;
			}else if(tempo == "3h"){
				return preco*3;
			}else if(tempo == "4h"){
				return preco*4;
			}else{
				return 0;
			}
		}

}
