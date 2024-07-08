package OperacoesBasicas.ListaDeTarefas;

public class Tarefa {
    //Atributo
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  descricao ;
    }

    //Getters
    public String getDescricao() {
        return this.descricao;
    }
}