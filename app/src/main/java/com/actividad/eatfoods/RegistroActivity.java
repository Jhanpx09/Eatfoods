package com.actividad.eatfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {


    TextView reinicio;
    private EditText name, email, password,phone;

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
        email = (EditText) findViewById(R.id.correo);
        password = (EditText) findViewById(R.id.contrasena);
        phone = (EditText) findViewById(R.id.telefono);



    }

    //Metodo para el envio a la confirmacion
    public void Enviar(View view) {
        Intent i = new Intent(RegistroActivity.this, ConfirmationActivity.class);
        i.putExtra("name_data", name.getText().toString());
        i.putExtra("email_data", email.getText().toString());
        i.putExtra("password_data", password.getText().toString());
        i.putExtra("phone_data", phone.getText().toString());
        startActivity(i);
    }

}