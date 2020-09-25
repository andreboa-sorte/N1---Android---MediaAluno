package com.example.n1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class notas extends AppCompatActivity {
    private EditText nota1;
    private EditText nota2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        final String nome = (String) getIntent().getExtras().get("nome");

        nota1 = findViewById(R.id.editTextNumberDecimal);
        nota2 = findViewById(R.id.editTextNumberDecimal2);
        Button botaoNext = (Button) findViewById(R.id.button2);
        botaoNext.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {

                String nota1Tep = nota1.getText().toString();
                double nota1Value = Double.parseDouble(nota1Tep);

                String nota2Tep = nota2.getText().toString();
                double nota2Value = Double.parseDouble(nota2Tep);

                Intent intent = new Intent( notas.this, media.class );

                intent.putExtra("nota1Value", nota1Value);
                intent.putExtra( "nota2Value", nota2Value );
                intent.putExtra("nome", nome);
                startActivity(intent);
                finish();
            }
        });
    }
}
