package br.com.fiap.entities;

public class LojaTenis {

    private int tenis_id_tenis;
    private int tenis_marca_id_marca;
    private int id_loja;
    private int preco;
    private int quantidade_estoque;

    public LojaTenis(int tenis_id_tenis, int tenis_marca_id_marca, int id_loja, int preco, int quantidade_estoque) {
        this.tenis_id_tenis = tenis_id_tenis;
        this.tenis_marca_id_marca = tenis_marca_id_marca;
        this.id_loja = id_loja;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
    }

    public int getTenis_id_tenis() {
        return tenis_id_tenis;
    }

    public void setTenis_id_tenis(int tenis_id_tenis) {
        this.tenis_id_tenis = tenis_id_tenis;
    }

    public int getTenis_marca_id_marca() {
        return tenis_marca_id_marca;
    }

    public void setTenis_marca_id_marca(int tenis_marca_id_marca) {
        this.tenis_marca_id_marca = tenis_marca_id_marca;
    }

    public int getId_loja() {
        return id_loja;
    }

    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
}
