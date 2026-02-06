package com.example.aula_mvc;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;
    private Integer estoque;


    //ESTOQUE
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    //CATEGORIA
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //PREÇO
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //NOME
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}
