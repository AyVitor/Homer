package Homer;

    class No {
        String dado;
        No anterior;
        No proximo;
    
        No(String dado) {
            this.dado = dado;
            this.anterior = null;
            this.proximo = null;
        }
    }
