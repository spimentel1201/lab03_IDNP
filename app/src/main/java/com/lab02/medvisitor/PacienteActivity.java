package com.lab02.medvisitor;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class PacienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void register(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        /*intent.putExtra(ENVIAR_NOMBRE, mensaje1);
        intent.putExtra(ENVIAR_EDAD, mensaje2);*/
        startActivity(intent);
    }
}
