package com.gabrielkreischer.quizzpoo;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class PerguntasERespostas extends AppCompatActivity implements Serializable {
    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private String respostaD;
    private String respostaCerta;


    public PerguntasERespostas(String pergunta, String respostaA, String respostaB, String respostaC, String respostaD, String respostaCerta){
        this.pergunta = pergunta;
        this.respostaA = respostaA;
        this.respostaB = respostaB;
        this.respostaC = respostaC;
        this.respostaD = respostaD;
        this.respostaCerta = respostaCerta;
    }


    // Gets ////////////////////////////////////////////////////////////////////////////////////////
    public String getPergunta() {
        return pergunta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public String getRespostaD() {
        return respostaD;
    }

    public String getRespostaCerta() {
        return respostaCerta;
    }

    // Sets ////////////////////////////////////////////////////////////////////////////////////////
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public void setRespostaD(String respostaD) {
        this.respostaD = respostaD;
    }

    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }


}
