package br.com.fiap.entities;

public class Tenis {

    private String nome;
    private String cor;
    private int id_tenis;
    private int marca_id_marca;

    public Tenis(String nome, String cor, int id_tenis, int marca_id_marca) {
        this.nome = nome;
        this.cor = cor;
        this.id_tenis = id_tenis;
        this.marca_id_marca = marca_id_marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId_tenis() {
        return id_tenis;
    }

    public void setId_tenis(int id_tenis) {
        this.id_tenis = id_tenis;
    }

    public int getMarca_id_marca() {
        return marca_id_marca;
    }

    public void setMarca_id_marca(int marca_id_marca) {
        this.marca_id_marca = marca_id_marca;
    }
}
