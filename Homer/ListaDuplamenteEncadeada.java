package Homer;

class ListaDuplamenteEncadeada {
    private No cabeca;
    private No cauda;
    private int tamanho;

    ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void adicionar(String dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
        tamanho++;
    }

    public void adicionar(int indice, String dado) {
        if (indice < 0 || indice > tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        No novoNo = new No(dado);
        if (indice == 0) {
            adicionarInicio(dado);
        } else if (indice == tamanho) {
            adicionar(dado);
        } else {
            No atual = cabeca;
            for (int i = 0; i < indice; i++) {
                atual = atual.proximo;
            }
            novoNo.proximo = atual;
            novoNo.anterior = atual.anterior;
            atual.anterior.proximo = novoNo;
            atual.anterior = novoNo;
            tamanho++;
        }
    }

    public void adicionarInicio(String dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
        tamanho++;
    }

    public void removerFim() {
        if (cauda != null) {
            if (cauda.anterior != null) {
                cauda = cauda.anterior;
                cauda.proximo = null;
            } else {
                cabeca = null;
                cauda = null;
            }
            tamanho--;
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        if (indice == 0) {
            removerInicio();
        } else if (indice == tamanho - 1) {
            removerFim();
        } else {
            No atual = cabeca;
            for (int i = 0; i < indice; i++) {
                atual = atual.proximo;
            }
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
            tamanho--;
        }
    }

    public void removerInicio() {
        if (cabeca != null) {
            if (cabeca.proximo != null) {
                cabeca = cabeca.proximo;
                cabeca.anterior = null;
            } else {
                cabeca = null;
                cauda = null;
            }
            tamanho--;
        }
    }

    public boolean contem(String dado) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.dado.equals(dado)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void limpar() {
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    public void imprimirLista() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public int tamanho() {
        return tamanho;
    }
}
