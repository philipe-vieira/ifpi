import javax.swing.JOptionPane;

public class endereço {
	private	String bairro,rua, cidade,estado,uf;
	private int numero, CEP;
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int CEP) {
		if ((CEP < 99999999)&&(CEP > 10000000)){
			this.CEP = CEP;
		}
		else
			JOptionPane.showMessageDialog(null, "CEP inválido!!!", null, JOptionPane.ERROR_MESSAGE);
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		
		if ((uf == "AC")||(uf == "AL")||(uf == "AM")||(uf == "AP")||(uf == "BA")||(uf == "CE")||(uf == "DF")||(uf == "ES")||(uf == "GO")||
				(uf == "MA")||(uf == "MG")||(uf == "MS")||(uf == "MT")||(uf == "PA")||(uf == "PB")||(uf == "PE")||(uf == "PI")||(uf == "PR")
				||(uf == "RJ")||(uf == "RN")||(uf == "RO")||(uf == "RR")||(uf == "RS")||(uf == "SC")||(uf == "SE")||(uf == "SP")||
				(uf == "TO")){
		this.uf = uf;
		}
		else{
			JOptionPane.showMessageDialog(null, "UF não identificado!!", null, JOptionPane.ERROR_MESSAGE);
		}
	}

	public String imprimir(){
		return ("Bairro: "+ bairro 
				+"\nRua: "+ rua 
				+"\nNumero: "+numero
				+"\nCEP: "+CEP
				+"\nCidade: "+cidade
				+"\nEstado: "+estado);
	}
}
