package Exercicios.Supermercado;

public class Produto {
    private DescricaoProduto descricao;
    private double preco;
    private int quantidadeEstoque;

    public Produto(DescricaoProduto descricao, double preco, int quantidadeEstoque) {

        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean reservar(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    public DescricaoProduto getDescricaoEnum() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao.name();
    }

    @Override
    public String toString() {
        return getDescricao() + "(R$ " + preco + ", estoque: " + quantidadeEstoque + ")";
    }
}