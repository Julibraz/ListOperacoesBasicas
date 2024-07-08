package OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.addItem("Mouse", 100.00, 10);
        carrinho.addItem("Teclado", 200.00, 5);
        carrinho.addItem("Monitor", 400.00, 2);

        System.out.println("Itens no carinho: ");
                carrinho.exibirItens();
        System.out.println("Valor Total: " + carrinho.valorTotal());
        System.out.println();

        carrinho.removerItem("Monitor");

        System.out.println("Itens no carinho: " );
        carrinho.exibirItens();
        System.out.println("Valor Total: ");
        System.out.println(carrinho.valorTotal());

    }
}
