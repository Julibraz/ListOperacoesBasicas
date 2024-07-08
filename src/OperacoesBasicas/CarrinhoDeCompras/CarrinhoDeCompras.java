package OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    //criando o carrinho de compras
    public  CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    //adicionando itens no carrinho
    public void addItem(String nome, double valor, int quantidade){
        itens.add(new Item(nome, valor, quantidade));
    }

    //Removenodo itens do carrinho
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
        System.out.println("Item " + nome + " Removido");
    }

    //Calculando o valor total do carrinho levando em consideração o valor e a quantidade de cada produto
    public double valorTotal(){
        double total = 0;
        for(Item i : itens){
            total += i.getValor() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        for(Item i : itens){
            System.out.println(i);
        }
    }

}
