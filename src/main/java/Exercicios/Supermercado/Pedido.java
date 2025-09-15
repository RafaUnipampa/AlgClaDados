package Exercicios.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private TipoPagamento pagamento;


    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean adicionarItem(Produto produto, int quantidade) {
        if (quantidade <= 0) return false;
        if (produto.reservar(quantidade)) {
            itens.add(new Item(produto, quantidade));
            return true;
        }
        return false;
    }

    public double total() {
        return itens.stream().mapToDouble(Item::subtotal).sum();
    }
/*public double total() {
    double soma = 0;
    for (Item i : itens) {
        soma += i.subtotal();
    }
    return soma;
}*/

    public void pagar(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean estaPago() {
        return pagamento != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente).append("\n");
        itens.forEach(i -> sb.append(" - ").append(i).append("\n"));
        sb.append("Total: R$").append(String.format("%.2f", total())).append("\n");
        sb.append("Pagamento: ").append(estaPago() ? pagamento : "Pendente");
        return sb.toString();
    }


}
