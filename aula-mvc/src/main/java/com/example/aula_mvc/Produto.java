package com.example.aula_mvc;

public class Produto {
    private Integer id;
    private String nome;
    private double preco;
    private String categoria;
    private int estoque;

    //ID
    //Constructor que já seta o ID quando for criado o inst do obj
    //Assim ele vai pedir como argumento o valor do ID
    public Produto(Integer id) {this.id = id; }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    //ESTOQUE
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}
