package com.actividad.eatfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BoardActivity extends AppCompatActivity {

    private TextView name_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
        getSupportActionBar().hide();

        name_view = (TextView) findViewById(R.id.name_view);

        String name_dato = getIntent().getStringExtra("name_data");
        name_view.setText("Hola "+name_dato);
    }
}