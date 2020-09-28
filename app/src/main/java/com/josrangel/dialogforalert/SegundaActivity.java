package com.josrangel.dialogforalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.josrangel.dialogforalert.entitys.Animal;
import com.josrangel.dialogforalert.entitys.Perro;
import com.josrangel.dialogforalert.entitys.Pez;

public class SegundaActivity extends AppCompatActivity {
    private TextView tvNombre, tvPatas;
    private ImageView imageView;
    private Animal animal;
    private Button btnLadrar, btnNadar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvNombre = findViewById(R.id.tvNombre);
        tvPatas = findViewById(R.id.tvPatas);
        imageView = findViewById(R.id.imageView);
        btnLadrar = findViewById(R.id.btnLadrar);
        btnNadar = findViewById(R.id.btnNadar);

        animal = getIntent().getParcelableExtra(MiAdaptador.EXTRA_ANIMAL);
        String nombreAnimal = animal.getNombre();
        int nPatas = animal.getPatas();
        int color = animal.getColor();
        tvNombre.setText(nombreAnimal);
        tvPatas.setText(String.valueOf(nPatas));/**/
        imageView.setBackgroundColor(getResources().getColor(color));

        /*if(animal.getClass().isInstance(Perro)){
            btnLadrar.setVisibility(View.VISIBLE);
        }

        if(animal instanceof Pez){
            btnNadar.setVisibility(View.VISIBLE);
        }*/
    }

    public void comer(View v){
        Toast.makeText(this,animal.comer(),Toast.LENGTH_SHORT).show();
    }

    public void dormir(View v){
        Toast.makeText(this,animal.dormir(),Toast.LENGTH_SHORT).show();
    }

    public void saltar(View v){
        Toast.makeText(this,animal.saltar(),Toast.LENGTH_SHORT).show();
    }

    public void nadar(View v){
        Pez pez= (Pez) animal;
        Toast.makeText(this,pez.nadar(),Toast.LENGTH_SHORT).show();
    }

    public void ladrar(View v){
        Perro perro= (Perro) animal;
        Toast.makeText(this,perro.ladrar(),Toast.LENGTH_SHORT).show();
    }
}