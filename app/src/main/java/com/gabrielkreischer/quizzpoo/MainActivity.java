package com.gabrielkreischer.quizzpoo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    TextView txtNumeroPergunta;
    TextView txtErros;
    TextView txtAcertos;
    TextView txtPergunta;
    RadioButton opc01;
    RadioButton opc02;
    RadioButton opc03;
    RadioButton opc04;
    RadioGroup grupoDeRespostas;
    Button proximo;

    int contador = 1;
    String respostaAtual;


    // objetos
    Jogador jogador = new Jogador("",0,0,0);

    PerguntasERespostas perguntasERespostas1 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas2 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas3 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas4 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas5 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas6 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas7 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas8 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas9 = new PerguntasERespostas("","","","","","");
    PerguntasERespostas perguntasERespostas10 = new PerguntasERespostas("","","","","","");

    PerguntasERespostas perguntaAtual = perguntasERespostas1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera o Intent
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");
        jogador.setNome(nome);

        //Define perguntas
        perguntasERespostas1.setPergunta(getString(R.string.p01_pergunta));
        perguntasERespostas1.setRespostaA(getString(R.string.p01_a));
        perguntasERespostas1.setRespostaB(getString(R.string.p01_b));
        perguntasERespostas1.setRespostaC(getString(R.string.p01_c));
        perguntasERespostas1.setRespostaD(getString(R.string.p01_d));
        perguntasERespostas1.setRespostaCerta(getString(R.string.p01_certa));

        perguntasERespostas2.setPergunta(getString(R.string.p02_pergunta));
        perguntasERespostas2.setRespostaA( getString(R.string.p02_a));
        perguntasERespostas2.setRespostaB( getString(R.string.p02_b));
        perguntasERespostas2.setRespostaC( getString(R.string.p02_c));
        perguntasERespostas2.setRespostaD( getString(R.string.p02_d));
        perguntasERespostas2.setRespostaCerta( getString(R.string.p02_certa));

        perguntasERespostas3.setPergunta(getString(R.string.p03_pergunta));
        perguntasERespostas3.setRespostaA( getString(R.string.p03_a));
        perguntasERespostas3.setRespostaB( getString(R.string.p03_b));
        perguntasERespostas3.setRespostaC( getString(R.string.p03_c));
        perguntasERespostas3.setRespostaD( getString(R.string.p03_d));
        perguntasERespostas3.setRespostaCerta( getString(R.string.p03_certa));

        perguntasERespostas4.setPergunta(getString(R.string.p04_pergunta));
        perguntasERespostas4.setRespostaA( getString(R.string.p04_a));
        perguntasERespostas4.setRespostaB( getString(R.string.p04_b));
        perguntasERespostas4.setRespostaC( getString(R.string.p04_c));
        perguntasERespostas4.setRespostaD( getString(R.string.p04_d));
        perguntasERespostas4.setRespostaCerta( getString(R.string.p04_certa));

        perguntasERespostas5.setPergunta(getString(R.string.p05_pergunta));
        perguntasERespostas5.setRespostaA( getString(R.string.p05_a));
        perguntasERespostas5.setRespostaB( getString(R.string.p05_b));
        perguntasERespostas5.setRespostaC( getString(R.string.p05_c));
        perguntasERespostas5.setRespostaD( getString(R.string.p05_d));
        perguntasERespostas5.setRespostaCerta( getString(R.string.p05_certa));

        perguntasERespostas6.setPergunta(getString(R.string.p06_pergunta));
        perguntasERespostas6.setRespostaA( getString(R.string.p06_a));
        perguntasERespostas6.setRespostaB( getString(R.string.p06_b));
        perguntasERespostas6.setRespostaC( getString(R.string.p06_c));
        perguntasERespostas6.setRespostaD( getString(R.string.p06_d));
        perguntasERespostas6.setRespostaCerta( getString(R.string.p06_certa));

        perguntasERespostas7.setPergunta(getString(R.string.p07_pergunta));
        perguntasERespostas7.setRespostaA( getString(R.string.p07_a));
        perguntasERespostas7.setRespostaB( getString(R.string.p07_b));
        perguntasERespostas7.setRespostaC( getString(R.string.p07_c));
        perguntasERespostas7.setRespostaD( getString(R.string.p07_d));
        perguntasERespostas7.setRespostaCerta( getString(R.string.p07_certa));

        perguntasERespostas8.setPergunta(getString(R.string.p08_pergunta));
        perguntasERespostas8.setRespostaA( getString(R.string.p08_a));
        perguntasERespostas8.setRespostaB( getString(R.string.p08_b));
        perguntasERespostas8.setRespostaC( getString(R.string.p08_c));
        perguntasERespostas8.setRespostaD( getString(R.string.p08_d));
        perguntasERespostas8.setRespostaCerta( getString(R.string.p08_certa));

        perguntasERespostas9.setPergunta(getString(R.string.p09_pergunta));
        perguntasERespostas9.setRespostaA( getString(R.string.p09_a));
        perguntasERespostas9.setRespostaB( getString(R.string.p09_b));
        perguntasERespostas9.setRespostaC( getString(R.string.p09_c));
        perguntasERespostas9.setRespostaD( getString(R.string.p09_d));
        perguntasERespostas9.setRespostaCerta( getString(R.string.p09_certa));

        perguntasERespostas10.setPergunta(getString(R.string.p10_pergunta));
        perguntasERespostas10.setRespostaA( getString(R.string.p10_a));
        perguntasERespostas10.setRespostaB( getString(R.string.p10_b));
        perguntasERespostas10.setRespostaC( getString(R.string.p10_c));
        perguntasERespostas10.setRespostaD( getString(R.string.p10_d));
        perguntasERespostas10.setRespostaCerta( getString(R.string.p10_certa));

        // atribui valores a interfacie
        txtNumeroPergunta = findViewById(R.id.txtNumeroPergunta);
        txtErros = findViewById(R.id.txtErros);
        txtAcertos = findViewById(R.id.txtAcertos);
        txtPergunta = findViewById(R.id.txtPergunta);
        opc01 = findViewById(R.id.opc01);
        opc02 = findViewById(R.id.opc02);
        opc03 = findViewById(R.id.opc03);
        opc04 = findViewById(R.id.opc04);
        proximo = findViewById(R.id.btnPergunta);
        grupoDeRespostas = findViewById(R.id.grupoDeRespostas);

        txtNumeroPergunta.setText("Pergunta 0"+Integer.toString(contador));
        txtErros.setText("Erros 0"+Integer.toString(jogador.getErros()));
        txtAcertos.setText("Acertos 0"+Integer.toString(jogador.getAcertos()));

        txtPergunta.setText(perguntasERespostas1.getPergunta());
        opc01.setText(perguntasERespostas1.getRespostaA());
        opc02.setText(perguntasERespostas1.getRespostaB());
        opc03.setText(perguntasERespostas1.getRespostaC());
        opc04.setText(perguntasERespostas1.getRespostaD());
        proximo.setEnabled(false);

    }

    public void habilitaBotao(View view){
        switch (view.getId()){
            case R.id.opc01:
                respostaAtual = "A";
                proximo.setEnabled(true);
                Log.d("BTN clicado", respostaAtual);
                break;
            case R.id.opc02:
                respostaAtual = "B";
                proximo.setEnabled(true);
                Log.d("BTN clicado", respostaAtual);
                break;
            case R.id.opc03:
                respostaAtual = "C";
                proximo.setEnabled(true);
                Log.d("BTN clicado", respostaAtual);
                break;
            case R.id.opc04:
                respostaAtual = "D";
                proximo.setEnabled(true);
                Log.d("BTN clicado", respostaAtual);
                break;
        }
    }
    public void proximaPergunta(View view){
        Log.d("BTN", respostaAtual);
        Log.d("BTN", perguntaAtual.getRespostaCerta() );
        if(perguntaAtual.getRespostaCerta().equals(respostaAtual)){
            jogador.setAcertos(jogador.getAcertos()+1);
            txtAcertos.setText("Acertos 0"+jogador.getAcertos());
        }else{
            jogador.setErros(jogador.getErros()+1);
            txtErros.setText("Erros 0"+jogador.getErros());
        }
        contador++;
        txtNumeroPergunta.setText("Pergunta 0"+Integer.toString(contador));
        switch (contador) {
            case 1:
                perguntaAtual = perguntasERespostas2;
                break;
            case 2:
                perguntaAtual = perguntasERespostas3;
                break;
            case 3:
                perguntaAtual = perguntasERespostas4;
                break;
            case 4:
                perguntaAtual = perguntasERespostas5;
                break;
            case 5:
                perguntaAtual = perguntasERespostas6;
                break;
            case 6:
                perguntaAtual = perguntasERespostas7;
                break;
            case 7:
                perguntaAtual = perguntasERespostas8;
                break;
            case 8:
                perguntaAtual = perguntasERespostas9;
                break;
            case 9:
                perguntaAtual = perguntasERespostas10;
                break;
            case 10:
                contador = 0;
                break;
        }


        txtPergunta.setText(perguntaAtual.getPergunta());
        opc01.setText(perguntaAtual.getRespostaA());
        opc02.setText(perguntaAtual.getRespostaB());
        opc03.setText(perguntaAtual.getRespostaC());
        opc04.setText(perguntaAtual.getRespostaD());
        proximo.setEnabled(false);
        grupoDeRespostas.clearCheck();

    }
    public void atualizaPerguntas(int numeroPergunta){

    }
}