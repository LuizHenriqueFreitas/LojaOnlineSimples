package br.com.luiz.LojaOnline;

import java.util.ArrayList;

public class Pedido {
	private Cliente cliente;
	private ArrayList<Produto> produtos;
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		produtos = new ArrayList<Produto>();
	}
	
	public void adiocionaProduto(Produto produto) {
		produtos.add(produto);
	}
	
	private double calculaSubtotal() {
		double subtotal = 0;
		for (Produto produto : produtos) {
			subtotal += produto.getPreco();
		}
		return subtotal;
	}
	
	private double calculaFrete() {
		double totalFrete = 0;
		for (Produto produto : produtos) {
			totalFrete += produto.getPeso();
		}
		return totalFrete * 5.0;
	}
	
	public void finaliza() {
		
		System.out.println("============= RESUMO DO PEDIDO =============");
		System.out.println(cliente);
		System.out.println("");
		
		System.out.println("============= ITENS DO PEDIDO ==============");
		//esse é um meio de fazer o programa percorrer todo o vetor de maneira mais compacta do que o bom e velho "for" convencional.
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		System.out.println("");
		
		//fazer isso é melhor do que chamar as funções inúmeras vezes na saída, pois assim se processa apenas uma vez e salvar em uma variável.
		double subtotal = calculaSubtotal();
		double frete = calculaFrete();
		double total = subtotal + frete;

		System.out.println("============= TOTAL DO PEDIDO ==============");
		System.out.println("SUBTOTAL: " + subtotal);
		System.out.println("FRETE: " + frete);
		System.out.println("TOTAL: " + total);
		System.out.println("");

		System.out.println("=============== FIM DO PEDIDO ==============");
	}
}
