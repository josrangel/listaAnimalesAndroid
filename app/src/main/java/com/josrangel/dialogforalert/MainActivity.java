package com.josrangel.dialogforalert;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Perro[] perros;
    MiAdaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perros = generaPerros();

        DialogoImplementador dialogoImplementador = new DialogoImplementador(this);
        listView = findViewById(R.id.listview);
        adaptador= new MiAdaptador(this,perros);
        listView.setAdapter(adaptador);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Click ok");
        builder.setNegativeButton("Cancel",dialogoImplementador);
        builder.setNeutralButton("Neutral",dialogoImplementador);
        builder.setPositiveButton("Posivo",dialogoImplementador);
        /*builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNeutralButton("neutro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });*/
        builder.show();

        Toast toast = Toast.makeText(this,"Texto a mostrar", Toast.LENGTH_LONG);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.RIGHT, 0,0);
        toast.show();

    }

    private Perro[] generaPerros(){
        Perro[] arregloPerro = new Perro[500];
        /*arregloPerro[0] = new Perro(R.mipmap.ic_launcher,"Perro 1");
        arregloPerro[1] = new Perro(R.mipmap.ic_launcher,"Perro 2");
        arregloPerro[2] = new Perro(R.mipmap.ic_launcher,"Perro 3");
        arregloPerro[3] = new Perro(R.mipmap.ic_launcher,"Perro 4");
        arregloPerro[4] = new Perro(R.mipmap.ic_launcher,"Perro 5");*/

        for (int i=0;i<499;i++){
            arregloPerro[i] = new Perro(R.mipmap.ic_launcher,"Perro "+i);
        }
        arregloPerro[499] = new Perro(R.drawable.ic_launcher_foreground,"Caballo");


        return arregloPerro;
    }
}