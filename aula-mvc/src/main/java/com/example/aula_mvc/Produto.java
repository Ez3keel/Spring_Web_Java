package com.example.aula_mvc;

public class Produto {
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco + 1;
    }

    //aqui le o nome
    public String getNome(){
        return nome;
    }
    //Escreve
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
