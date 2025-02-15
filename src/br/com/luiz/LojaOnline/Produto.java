package br.com.luiz.LojaOnline;

public class Produto {
	//declarando os atributos da classe
	private String nome;
	private double preco;
	private double peso;
	
	//declarando o construtor da classe
	public Produto (String nome, double preco, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	
	//Declarando os geters e seters de cada atributo
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//usnado o metodo Override para sobrescrever o modo de apresentação dos dados
	/*@Override
	public String toString() {
		return "Cliente: " + nome + " / Email: " + email + "";
	}*/
}
