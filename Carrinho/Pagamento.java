package Carrinho;

public class Pagamento {
    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho();
        String nome = "Produto 1";
        double preco = 12.99;
        int quantidade = 2;

        carrinho1.adicionarProduto(nome, preco, quantidade);
    }
}
