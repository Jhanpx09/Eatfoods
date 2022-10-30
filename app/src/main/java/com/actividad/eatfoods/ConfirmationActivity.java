package com.actividad.eatfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    private TextView name_view, email_view, password_view, phone_view;
    Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        getSupportActionBar().hide();


        name_view = (TextView) findViewById(R.id.name_confirm);
        email_view = (TextView) findViewById(R.id.email_confirm);
        password_view = (TextView) findViewById(R.id.password_confirm);
        phone_view = (TextView) findViewById(R.id.phone_confirm);
        again = (Button) findViewById(R.id.volver);


        String name_dato = getIntent().getStringExtra("name_data");
        String email_dato = getIntent().getStringExtra("email_data");
        String password_dato = getIntent().getStringExtra("password_data");
        String phone_dato = getIntent().getStringExtra("phone_data");
        name_view.setText(name_dato);
        email_view.setText(email_dato);
        password_view.setText(password_dato);
        phone_view.setText(phone_dato);

    }

    public void Volver(View view){
        Intent again = new Intent(ConfirmationActivity.this, MainActivity.class);
        startActivity(again);
    }

}