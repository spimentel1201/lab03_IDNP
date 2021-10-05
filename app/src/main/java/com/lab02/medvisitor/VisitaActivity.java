package com.lab02.medvisitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class VisitaActivity extends AppCompatActivity {
    ArrayList<Visita> visitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);
    }

    public void registrar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        EditText dni,peso,temperatura,presion,saturacion;
        dni=(EditText)findViewById(R.id.EditTextDnis);
        String dnis = dni.getText().toString();
        peso=(EditText)findViewById(R.id.EditTextWeight);
        double pesos1 = Double.parseDouble(peso.getText().toString());
        temperatura=(EditText)findViewById(R.id.EditTextTemperature);
        double temperatura1 = Double.parseDouble(temperatura.getText().toString());
        presion=(EditText)findViewById(R.id.EditTextPresure);
        double presion1 = Double.parseDouble(presion.getText().toString());
        saturacion=(EditText)findViewById(R.id.EditTextSaturation);
        double saturacion1 = Double.parseDouble(saturacion.getText().toString());

        Visita v = new Visita(pesos1,temperatura1,presion1,saturacion1);
        Paciente a = new Paciente();
        a.agregarVisita(v);

        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("objeto1",a);
        startActivity(i);
    }
}
