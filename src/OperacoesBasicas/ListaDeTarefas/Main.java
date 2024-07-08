package OperacoesBasicas.ListaDeTarefas;

public class Main {
    public static void  main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        //verificando o numero de tarefas
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        //adicionando tarefa
        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        listaTarefa.addTarefa("Tarefa 3");

        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        //removendo tarefa
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());

        //obtendo descricoes das tarefas
        listaTarefa.obterDescricoesTarefas();
    }
}
