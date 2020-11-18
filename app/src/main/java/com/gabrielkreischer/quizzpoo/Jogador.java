package com.gabrielkreischer.quizzpoo;

public class Jogador {
    private String nome;
    private int acertos;
    private int erros;
    private float media;

    public Jogador(String nome, int acertos, int erros, float media) {
        this.nome = nome;
        this.acertos = acertos;
        this.erros = erros;
        this.media = media;
    }
    // Cria Getters ////////////////////////////////////////////////////////////////////////////////
    public String getNome() {
        return nome;
    }

    public int getAcertos() {
        return acertos;
    }

    public int getErros() {
        return erros;
    }

    public float getMedia() {
        return media;
    }

    // Cria Setters ////////////////////////////////////////////////////////////////////////////////

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
