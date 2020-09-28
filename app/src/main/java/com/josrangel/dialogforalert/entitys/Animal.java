package com.josrangel.dialogforalert.entitys;

import android.os.Parcel;
import android.os.Parcelable;

abstract public class Animal implements Parcelable {
    protected String nombre;
    protected int color;
    protected int patas;

    public Animal(String nombre, int color, int patas) {
        this.nombre = nombre;
        this.color = color;
        this.patas = patas;
    }

    public Animal(Parcel source) {
        nombre = source.readString();
        color = source.readInt();
        patas = source.readInt();
    }

    public String comer(){
        return "Comiendo ...";
    }

    public String dormir(){
        return "Durmiendo zzzzz...";
    }

    public String saltar(){
        return "Saltando ...";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeInt(color);
        parcel.writeInt(patas);
    }

    public static Parcelable.Creator<Animal> CREATOR = new Parcelable.Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel source) {
            return new Animal(source) {
            };
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };
}
