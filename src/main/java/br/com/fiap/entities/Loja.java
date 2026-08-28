package br.com.fiap.entities;

public class Loja {

    private int id_loja;
    private String filial;
    private String nome;

    public Loja(int id_loja, String filial, String nome) {
        this.id_loja = id_loja;
        this.filial = filial;
        this.nome = nome;
    }


    public int getId_loja() {
        return id_loja;
    }

    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
