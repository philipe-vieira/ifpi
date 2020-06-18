import java.util.Random;

import javax.swing.JOptionPane;

import contacpf.validacpf;

public class dadosUsuario extends endereço{
	private String nome, senha, intrumento, cpf;
	protected int id;
	
	
	public int newId() {
		//this.id = id + 73;//this.id = id + 73;
		Random gerador = new Random();
		id = gerador.nextInt();
		if (id < 0){
			this.id = id * -1;
			return this.id;
		}else {
			return id;
		}
		
		
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return validacpf.imprimeCPF(cpf);
	}
	public void setCpf(String cpf) {
		int resp;
		do{
			
			if (validacpf.isCPF(cpf) == true){
				resp = 1;
				this.cpf = cpf;
				// System.out.printf("%s\n", validacpf.imprimeCPF(cpf));
			}
		      
		    else{ 
		    	resp = 2;
		    	JOptionPane.showMessageDialog(null, "Erro, CPF inválido !!!\n");
		    	cpf = JOptionPane.showInputDialog(null, "CPF: ", "ex: 12345678912");
		    }
		}while(resp != 1);

	}
	public String getIntrumento() {
		return intrumento;
	}
	public void setIntrumento(String intrumento) {
		this.intrumento = intrumento;
	}
	

}
