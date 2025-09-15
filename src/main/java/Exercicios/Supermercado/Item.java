package Exercicios.Supermercado;

public class Item {
    private Produto produto;
    private int quantidade;


    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double subtotal(){
        return produto.getPreco() * quantidade;
    }
    @Override
    public String toString() {
        return produto.getDescricao() + " x" + quantidade + " = R$ " + String.format("%.2f",subtotal());
    }
}
