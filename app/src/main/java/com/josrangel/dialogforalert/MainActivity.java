package com.josrangel.dialogforalert;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.Toast;

import com.josrangel.dialogforalert.entitys.Animal;
import com.josrangel.dialogforalert.entitys.Gato;
import com.josrangel.dialogforalert.entitys.Perro;
import com.josrangel.dialogforalert.entitys.Pez;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Animal[] animales;
    MiAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animales = generaAnimales();

        listView = findViewById(R.id.listview);
        adaptador= new MiAdaptador(this,animales);
        listView.setAdapter(adaptador);/**/
    }

    private Animal[] generaAnimales(){
        Animal[] arregloAnimales = new Animal[7];
        arregloAnimales[0] = new Perro("Perro 1",R.color.colorAccent, 4) ;
        arregloAnimales[1] = new Pez("Pez 1",R.color.colorPrimary, 0);
        arregloAnimales[2] = new Gato("Gato 1",R.color.colorPrimaryDark, 4);
        arregloAnimales[3] = new Gato("Gato 2",R.color.colorPrimary, 4);
        arregloAnimales[4] = new Perro("Perro 2",R.color.colorPrimaryDark, 4);
        arregloAnimales[5] = new Pez("Pez 2",R.color.colorAccent, 0);/**/
        arregloAnimales[6] = new Pez("Pez 3",R.color.colorPrimary, 0);

        return arregloAnimales;
    }
}