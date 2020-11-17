package com.gabrielkreischer.quizzpoo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle SaveInstanceState){
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.login);
    }

    public void usuario(){
        Intent intent = new Intent(Login.this, MainActivity.class);
        intent.putExtra("nome", "Gabriel");
    }
}
