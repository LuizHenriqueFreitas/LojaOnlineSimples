package br.com.luiz.LojaOnline;

public class Cliente {
	//declarando os atributos da classe.
	private String nome;
	private String email;
	private String cpf;
	
	//declarando o construtor da classe.
	public Cliente (String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	//Declarando os geters e seters de cada atributo.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//usnado o metodo Override para sobrescrever o modo de apresentação dos dados.
	@Override
	public String toString() {
		return "Cliente: " + nome + " / Email: " + email + "";
	}
}
