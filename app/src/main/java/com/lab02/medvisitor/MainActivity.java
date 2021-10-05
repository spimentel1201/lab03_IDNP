package com.lab02.medvisitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static Paciente paciente;
    //public static final List<String> ENVIAR_LISTA = pacientes;
    private String Lista;
    Bundle recepcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ArrayList<Paciente> lista = (ArrayList<Paciente>) getIntent().getSerializableExtra("listaPaciente");

        /*if(!lista.isEmpty()){
            Paciente paciente1 = lista.get(0);
            String prueba = paciente1.getNombre() + " " + paciente1.getApellido();
            pru.setText(prueba);
        /*}else{
            pru.setText("Vacio");
            System.out.print("Vacio");
        }*/


    }
    public void registrarVisita(View view){
        Intent intent = new Intent(this, VisitaActivity.class);
        intent.putExtra(Lista, (Parcelable) paciente);
        /*intent.putExtra(ENVIAR_EDAD, mensaje2);*/
        startActivity(intent);
    }

    public void verInfo(View view) {
        EditText pru = (EditText)findViewById(R.id.EditTextPrueba);
        Intent uno = getIntent();
        Paciente x = (Paciente) uno.getSerializableExtra("objeto1");
        /*ArrayList<Visita> pruebaa = x.obtenerVisita();
        double pesos = pruebaa.get(0).getPeso();
        String respuesta = Double.toString(pesos);*/

        pru.setText("No me sale :v");
    }
}
