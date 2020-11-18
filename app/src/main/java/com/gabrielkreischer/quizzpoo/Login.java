package com.gabrielkreischer.quizzpoo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Login extends AppCompatActivity {

    protected void onCreate(Bundle SaveInstanceState){
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.login);
    }

    public void usuario(View view){
        EditText txtNome = findViewById(R.id.txtNome);
        String nome = txtNome.getText().toString();

        Log.d("Teste", "Clicou");
        Intent intent = new Intent(Login.this, MainActivity.class);
        intent.putExtra("nome", nome);
        startActivity(intent);
    }
}
