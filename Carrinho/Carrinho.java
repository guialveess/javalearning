package Carrinho;

public class Carrinho {
    public void adicionarProduto(String nome, double preco, int quantidade) {
        double total = preco * quantidade;
        System.out.println("Produto adicionado: " + nome + " - " + preco + " - " + quantidade + " unidades - " + total);
    }
}
