package com.josrangel.dialogforalert;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.josrangel.dialogforalert.entitys.Animal;
import com.josrangel.dialogforalert.entitys.Perro;

public class MiAdaptador extends BaseAdapter {
    Context context;
    Animal[] animales;

    static final String EXTRA_ANIMAL = "com.josrangel.miadapter.EXTRA_ANIMAL";

    public MiAdaptador(Context context, Animal[] animales) {
        this.context = context;
        this.animales = animales;
    }

    @Override
    public int getCount() {
        return animales.length;
    }

    @Override
    public Object getItem(int position) {
        return animales[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        }
        TextView tvElemento = convertView.findViewById(R.id.tvElemento);
        TextView imagen = convertView.findViewById(R.id.image);
        String nombreAnimal=animales[position].getNombre();
        int color=animales[position].getColor();
        tvElemento.setText(nombreAnimal);
        imagen.setBackgroundColor(convertView.getResources().getColor(color));
        RelativeLayout relative= convertView.findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,SegundaActivity.class);
                i.putExtra(EXTRA_ANIMAL,animales[position]);
                context.startActivity(i);
            }
        });

        return convertView;
    }
}
