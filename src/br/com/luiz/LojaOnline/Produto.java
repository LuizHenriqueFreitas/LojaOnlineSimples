package br.com.luiz.LojaOnline;

public class Produto {
	
	//declarando os atributos da classe.
	private String nome;
	private double preco;
	private double peso;
	
	//declarando o construtor da classe.
	public Produto (String nome, double preco, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}
	
	//Declarando os geters de cada atributo.
	//Não usaremos seters pois essa é a API do usuário, que não pode mudar informações sobre os produtos.
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getPeso() {
		return peso;
	}
	
	//usnado o metodo Override para sobrescrever o modo de apresentação dos dados.
	@Override
	public String toString() {
		return "Produto: " + nome + " / Preco: R$" + preco + "";
	}
}
