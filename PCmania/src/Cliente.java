class Cliente {
    String nome;
    long cpf;
    Computador[] compras;
    int qtdCompras = 0;

    Cliente(String nome, long cpf, int maxCompras) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[maxCompras];
    }

    void comprarComputador(Computador pc) {
        if (qtdCompras < compras.length) {
            compras[qtdCompras++] = pc;
            System.out.println(pc.marca + " adicionado ao carrinho.");
        } else {
            System.out.println("Limite de compras atingido!");
        }
    }

    void calculaTotalCompra() {
        float total = 0;
        System.out.println("\n--- RESUMO DA COMPRA ---");
        System.out.println("Cliente: " + nome + " (CPF: " + cpf + ")");
        for (int i = 0; i < qtdCompras; i++) {
            System.out.print("PC ");
            compras[i].mostraPCConfigs();
            total += compras[i].preco;
        }
        System.out.println("Total: R$ " + total);
    }
}

