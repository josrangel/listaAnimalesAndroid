package com.josrangel.dialogforalert.entitys;

public class Pez extends Animal {

    public Pez(String nombre, int color, int patas) {
        super(nombre, color, patas);
    }

    public String nadar(){
        return "nadando ...";
    }
}
