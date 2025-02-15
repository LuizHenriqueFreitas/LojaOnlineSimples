package br.com.luiz.LojaOnline;

public class LojaOnline {

	public static void main(String[] args) {
		System.out.println("Bem Vindo a Loja Online!");
		
		Cliente cliente = new Cliente("Fulano", "fulano@email.com", "12345678900");
		
		Produto Livro = new Produto("A ilha misteriosa", 40.00, 0.6);
		Produto Jogo = new Produto("Deep Rock Galatic", 60.00, 0.25);
		Produto Console = new Produto("Xbox Series X", 4000.00, 2);
		
		Pedido pedido = new Pedido(cliente);
		pedido.adiocionaProduto(Livro);
		pedido.adiocionaProduto(Jogo);
		pedido.adiocionaProduto(Console);
		
		pedido.finaliza();
	}

}
