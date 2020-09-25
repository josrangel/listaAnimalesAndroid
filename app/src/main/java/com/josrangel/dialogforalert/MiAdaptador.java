package com.josrangel.dialogforalert;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MiAdaptador extends BaseAdapter {
    Context context;
    Perro[] perros;

    static final String EXTRA_PERRO = "com.extraperro";

    public MiAdaptador(Context context, Perro[] perros) {
        this.context = context;
        this.perros = perros;
    }

    @Override
    public int getCount() {
        return perros.length;
    }

    @Override
    public Object getItem(int position) {
        return perros[position];
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
        ImageView imagen = convertView.findViewById(R.id.image);
        String nombrePerro=perros[position].getNombre();
        tvElemento.setText(nombrePerro);
        imagen.setImageResource(perros[position].getImagen());

        tvElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,SegundaActivity.class);
                i.putExtra(EXTRA_PERRO,String.valueOf(position));
                context.startActivity(i);
            }
        });

        return convertView;
    }
}
