package Homer;


public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.adicionar("Homer");
        lista.adicionarInicio("Bart");
        lista.adicionar("Marge");
        lista.adicionar(1, "Maggie");
        lista.adicionarInicio("Ned Flanders");
        lista.adicionar("Sr. Burns");
        lista.imprimirLista();

        lista.removerFim();
        lista.imprimirLista();

        lista.remover(1);
        lista.imprimirLista();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho: " + lista.tamanho());

        lista.removerInicio();
        lista.imprimirLista();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("Marge está na lista? " + lista.contem("Marge"));
        System.out.println("Homer está na lista? " + lista.contem("Homer"));
        System.out.println("Bart está na lista? " + lista.contem("Bart"));
        System.out.println("Maggie está na lista? " + lista.contem("Maggie"));
        System.out.println("Tamanho: " + lista.tamanho());

        lista.limpar();
        lista.imprimirLista();
    }
}