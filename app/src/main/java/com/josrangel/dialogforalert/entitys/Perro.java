package com.josrangel.dialogforalert.entitys;

import android.os.Parcel;
import android.os.Parcelable;

public class Perro extends Animal{

    public Perro(String nombre, int color, int patas) {
        super(nombre, color, patas);
    }

    public String ladrar(){
        return "Guau Guau Guau Guau...";
    }

    @Override
    public String saltar() {
        return "Saltando en dos patas :V";
    }
}
