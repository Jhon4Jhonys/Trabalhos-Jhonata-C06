import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do cliente: ");
        long cpf = scanner.nextLong();
        Cliente cliente = new Cliente(nome, cpf, 10);

        int matricula = 2061;
        Computador[] promocoes = new Computador[3];

        promocoes[0] = new Computador("Apple", matricula,
                new SistemaOperacional("Linux Ubuntu", 32),
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new MemoriaUSB("Pen-drive", 16)
        );

        promocoes[1] = new Computador("Samsung", matricula + 1234,
                new SistemaOperacional("Windows 8", 64),
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new MemoriaUSB("Pen-drive", 32)
        );

        promocoes[2] = new Computador("Dell", matricula + 5678,
                new SistemaOperacional("Windows 10", 64),
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new MemoriaUSB("HD Externo", 1000)
        );

        int opcao;
        do {
            System.out.print("Escolha a promoção (1-3) ou 0 para finalizar: ");
            opcao = scanner.nextInt();
            if (opcao >= 1 && opcao <= 3) {
                cliente.comprarComputador(promocoes[opcao - 1]);
            }
        } while (opcao != 0);

        cliente.calculaTotalCompra();
        scanner.close();
    }
}