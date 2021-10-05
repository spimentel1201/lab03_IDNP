package com.lab02.medvisitor;

import java.io.Serializable;
import java.util.ArrayList;

public class Paciente implements Serializable {
    String nombre, apellido, dni, direccion;
    ArrayList<Visita> visitas;
    Paciente(){

    }

    Paciente(String nombres,String apellidos, String dnis, String direccions){
        this.nombre= nombres;
        this.apellido=apellidos;
        this.dni = dnis;
        this.direccion=direccions;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void agregarVisita(Visita a){
        visitas.add(a);
    }

    public ArrayList<Visita> obtenerVisita(){
        return visitas;
    }
}
