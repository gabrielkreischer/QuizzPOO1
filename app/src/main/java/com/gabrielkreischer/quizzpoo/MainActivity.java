package com.gabrielkreischer.quizzpoo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pergunta pergunta1 = new Pergunta(
                "Quanto é 2+2?",
                "4",
                "6",
                "8",
                "10",
                "A"
        );
        Pergunta pergunta2 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta3 = new Pergunta(
                "Quanto é 8/2?",
                "4",
                "6",
                "8",
                "16",
                "A"
        );
        Pergunta pergunta4 = new Pergunta(
                "Quanto é 42 - 4?",
                "28",
                "38",
                "40",
                "2",
                "B"
        );
        Pergunta pergunta5 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta6 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta7 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta8 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta9 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );
        Pergunta pergunta10 = new Pergunta(
                "Quanto é 8*2?",
                "4",
                "6",
                "8",
                "16",
                "D"
        );


    }
}