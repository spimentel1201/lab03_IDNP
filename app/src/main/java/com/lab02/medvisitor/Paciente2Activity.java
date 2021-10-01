package com.lab02.medvisitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Map;

public class Paciente2Activity extends AppCompatActivity {
    Bundle lista;
    ArrayList<Paciente> pacientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente2);
    }
    public void register(View view){
        EditText nombres,apellidos,dni,direccion;
        nombres = (EditText)findViewById(R.id.EditTextNames);
        apellidos = (EditText)findViewById(R.id.EditTextLastnames);
        dni = (EditText)findViewById(R.id.EditTextDni);
        direccion = (EditText)findViewById(R.id.EditTextAddress);

        String nombres1,apellidos1,dni1,direccion1;
        nombres1 = nombres.getText().toString();
        apellidos1 = apellidos.getText().toString();
        dni1 = dni.getText().toString();
        direccion1 = direccion.getText().toString();

        Paciente a = new Paciente(nombres1,apellidos1,dni1,direccion1);
        registroPaciente(a);
        System.out.println("Nombre:" +a.getNombre());

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("listaPaciente",pacientes);
        /*intent.putExtra(ENVIAR_EDAD, mensaje2);*/
        startActivity(intent);
    }

    private void registroPaciente(Paciente a) {
        pacientes.add(a);
    }

    public void cancelar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
