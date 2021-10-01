package com.lab02.medvisitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import java.util.ArrayList;

public class VisitaActivity extends AppCompatActivity {
    ArrayList<Visita> visitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);
    }

    public void atras(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void registrarVisita(Visita y){
        visitas.add(y);
    }
}
