package com.actividad.eatfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {


    TextView reinicio;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        getSupportActionBar().hide();


        reinicio = (TextView) findViewById(R.id.reinicio);
        reinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistroActivity.this, MainActivity.class));

            }
        });


        name = (EditText) findViewById(R.id.nombre);

    }

    //Metodo para el envio
    public void Enviar(View view) {
        Intent i = new Intent(RegistroActivity.this, BoardActivity.class);
        i.putExtra("name_data", name.getText().toString());
        startActivity(i);
    }

}