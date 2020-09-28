package com.josrangel.dialogforalert.entitys;

import android.os.Parcel;

public class Gato extends Animal {
    public Gato(String nombre, int color, int patas) {
        super(nombre, color, patas);
    }

    @Override
    public String comer() {
        return "Comiendo croquetas";
    }
}
