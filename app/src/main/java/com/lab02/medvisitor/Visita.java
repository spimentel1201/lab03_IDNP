package com.lab02.medvisitor;

import java.io.Serializable;
import java.util.ArrayList;

public class Visita implements Serializable {
    Double peso, temperatura, presion, nivelSaturacion;
    Visita(){

    }

    Visita(Double pesos,Double temperaturas, Double presions, Double nivelSaturacions){
        this.peso = pesos;
        this.temperatura = temperaturas;
        this.presion = presions;
        this.nivelSaturacion = nivelSaturacions;
    }

    public Double getPeso(){
        return this.peso;
    }

    public Double getTemperatura(){
        return this.temperatura;
    }

    public Double getPresion(){
        return this.presion;
    }

    public Double getNivelSaturacion(){
        return this.nivelSaturacion;
    }
}