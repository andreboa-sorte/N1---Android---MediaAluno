package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class media extends AppCompatActivity {
    private TextView nome;
    private TextView media;
    private TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        nome = findViewById(R.id.textView9);
        media = findViewById(R.id.textView6);
        msg = findViewById(R.id.textView8);
        String nomevalue = (String) getIntent().getExtras().get("nome");
        double nota1 = (Double) getIntent().getExtras().get("nota1Value");
        double nota2 = (Double) getIntent().getExtras().get("nota2Value");
        double notamedia = ((nota1 + nota2) / 2);
        String textmsg = "";
        if (notamedia >= 7 ){
            textmsg = "Aluno Aprovado";
        }else{
            textmsg = "Aluno Reprovado";
        }

        nome.setText(nomevalue);
        media.setText(String.valueOf(notamedia));
        msg.setText(textmsg);
    }
}