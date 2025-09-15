package Exercicios.Supermercado;

import java.util.Scanner;

public class SupermercadoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // “Estoque” simples em memória
        Produto[] estoque = {
                new Produto(DescricaoProduto.ARROZ,   5.00, 20),
                new Produto(DescricaoProduto.FEIJAO,  7.00, 15),
                new Produto(DescricaoProduto.FARINHA, 4.50, 10),
                new Produto(DescricaoProduto.LEITE,   6.00, 30)
        };

        Pedido pedidoAtual = null;
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1) Novo pedido");
            System.out.println("2) Adicionar item ao pedido");
            System.out.println("3) Realizar pagamento");
            System.out.println("4) Mostrar pedido");
            System.out.println("0) Sair");
            System.out.print("Opção: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();
                    pedidoAtual = new Pedido(new Cliente(nome, cpf));
                    System.out.println(">> Pedido do cliente atual criado!");
                }
                case 2 -> {
                    if (pedidoAtual == null) {
                        System.out.println("Crie um pedido primeiro (opção 1).");
                        break;
                    }
                    System.out.println("Produtos disponíveis:");
                    for (int i = 0; i < estoque.length; i++) {
                        System.out.println(i + ") " + estoque[i]);
                    }
                    System.out.print("Escolha o índice do produto: ");
                    int idx = lerInt(sc);
                    if (idx < 0 || idx >= estoque.length) {
                        System.out.println("Índice inválido.");
                        break;
                    }
                    System.out.print("Quantidade: ");
                    int qtd = lerInt(sc);
                    boolean ok = pedidoAtual.adicionarItem(estoque[idx], qtd);
                    System.out.println(ok ? ">> Item adicionado!" : ">> Estoque insuficiente ou qtd inválida.");
                }
                case 3 -> {
                    if (pedidoAtual == null) {
                        System.out.println("Crie um pedido primeiro (opção 1).");
                        break;
                    }
                    System.out.println("Total: R$ " + String.format("%.2f", pedidoAtual.total()));
                    System.out.print("Forma (1-Dinheiro, 2-Cheque, 3-Cartão): ");
                    int f = lerInt(sc);
                    TipoPagamento tp = switch (f) {
                        case 1 -> TipoPagamento.DINHEIRO;
                        case 2 -> TipoPagamento.CHEQUE;
                        default -> TipoPagamento.CARTAO;
                    };
                    pedidoAtual.pagar(tp);
                    System.out.println(">> Pagamento registrado: " + tp);
                }
                case 4 -> {
                    if (pedidoAtual == null) System.out.println("Nenhum pedido.");
                    else System.out.println("\n" + pedidoAtual + "\n");
                }
                case 0 -> System.out.println("Encerrando...");
                default -> { /* ignora outros valores */ }
            }
        } while (opcao != 0);

        sc.close();
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) { sc.next(); }
        int v = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        return v;
    }
}
