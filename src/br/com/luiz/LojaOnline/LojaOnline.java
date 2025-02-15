package br.com.luiz.LojaOnline;

public class LojaOnline {

	public static void main(String[] args) {
		System.out.println("Bem Vindo a Loja Online!");
		
		Cliente cliente = new Cliente("Fulano", "fulano@email.com", "12345678900");
		System.out.println(cliente);
	}

}
