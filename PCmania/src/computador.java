class Computador {
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico[] hardwares;
    MemoriaUSB memoriaUSB;

    Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hardwares, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.so = so;
        this.hardwares = hardwares;
        this.memoriaUSB = memoriaUSB;
    }

    void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        for (HardwareBasico hw : hardwares) {
            System.out.println(hw.nome + ": " + hw.capacidade);
        }
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + " bits)");
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "GB");
        }
        System.out.println("Preço: R$ " + preco);
    }
}