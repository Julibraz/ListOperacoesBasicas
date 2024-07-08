package OperacoesBasicas.CarrinhoDeCompras;

public class Item {

    private String nome;
    private double valor;
    private int quantidade;

    public Item(String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }
    public double getValor(){
        return this.valor;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome= '" + nome + '\'' +
                ", valor= R$" + valor +
                ", quantidade= " + quantidade +
                '}';
    }
}
