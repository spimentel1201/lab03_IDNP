package com.lab02.medvisitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registrarPaciente(View view){
        Intent intent = new Intent(this, Paciente2Activity.class);
        /*intent.putExtra(ENVIAR_NOMBRE, mensaje1);
        intent.putExtra(ENVIAR_EDAD, mensaje2);*/
        startActivity(intent);
    }

}
