package com.fatecrl.demomvc.models;

public class Jogador {
    private String nome;
    private String posicao;
    private String avaliacao;

    Jogador(){}

    public Jogador(String nome, String posicao, String avaliacao){
        this.nome=nome;
        this.posicao=posicao;
        this.avaliacao=avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
}
