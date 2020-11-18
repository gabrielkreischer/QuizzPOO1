package com.gabrielkreischer.quizzpoo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView txtNumeroPergunta;
    TextView txtErros;
    TextView txtAcertos;
    TextView txtPergunta;
    RadioButton opc01;
    RadioButton opc02;
    RadioButton opc03;
    RadioButton opc04;
    Button proximo;
    int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera o Intent
        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");
        Log.d("Teste", nome);

        // Cria o objeto Jogador
        Jogador jogador = new Jogador(nome,0,0,0);

        // cria as perguntas
        PerguntasERespostas perguntasERespostas1 = new PerguntasERespostas(
                getString(R.string.p01_pergunta),
                getString(R.string.p01_a),
                getString(R.string.p01_b),
                getString(R.string.p01_c),
                getString(R.string.p01_d),
                getString(R.string.p01_certa)
        );

        PerguntasERespostas perguntasERespostas2 = new PerguntasERespostas(
                getString(R.string.p02_pergunta),
                getString(R.string.p02_a),
                getString(R.string.p02_b),
                getString(R.string.p02_c),
                getString(R.string.p02_d),
                getString(R.string.p02_certa)
        );
        PerguntasERespostas perguntasERespostas3 = new PerguntasERespostas(
                getString(R.string.p03_pergunta),
                getString(R.string.p03_a),
                getString(R.string.p03_b),
                getString(R.string.p03_c),
                getString(R.string.p03_d),
                getString(R.string.p03_certa)
        );
        PerguntasERespostas perguntasERespostas4 = new PerguntasERespostas(
                getString(R.string.p04_pergunta),
                getString(R.string.p04_a),
                getString(R.string.p04_b),
                getString(R.string.p04_c),
                getString(R.string.p04_d),
                getString(R.string.p04_certa)
        );
        PerguntasERespostas perguntasERespostas5 = new PerguntasERespostas(
                getString(R.string.p05_pergunta),
                getString(R.string.p05_a),
                getString(R.string.p05_b),
                getString(R.string.p05_c),
                getString(R.string.p05_d),
                getString(R.string.p05_certa)
        );
        PerguntasERespostas perguntasERespostas6 = new PerguntasERespostas(
                getString(R.string.p06_pergunta),
                getString(R.string.p06_a),
                getString(R.string.p06_b),
                getString(R.string.p06_c),
                getString(R.string.p06_d),
                getString(R.string.p06_certa)
        );
        PerguntasERespostas perguntasERespostas7 = new PerguntasERespostas(
                getString(R.string.p07_pergunta),
                getString(R.string.p07_a),
                getString(R.string.p07_b),
                getString(R.string.p07_c),
                getString(R.string.p07_d),
                getString(R.string.p07_certa)
        );
        PerguntasERespostas perguntasERespostas8 = new PerguntasERespostas(
                getString(R.string.p08_pergunta),
                getString(R.string.p08_a),
                getString(R.string.p08_b),
                getString(R.string.p08_c),
                getString(R.string.p08_d),
                getString(R.string.p08_certa)
        );
        PerguntasERespostas perguntasERespostas9 = new PerguntasERespostas(
                getString(R.string.p09_pergunta),
                getString(R.string.p09_a),
                getString(R.string.p09_b),
                getString(R.string.p09_c),
                getString(R.string.p09_d),
                getString(R.string.p09_certa)
        );
        PerguntasERespostas perguntasERespostas10 = new PerguntasERespostas(
                getString(R.string.p10_pergunta),
                getString(R.string.p10_a),
                getString(R.string.p10_b),
                getString(R.string.p10_c),
                getString(R.string.p10_d),
                getString(R.string.p10_certa)
        );

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
        proximo.setEnabled(true);
    }
}