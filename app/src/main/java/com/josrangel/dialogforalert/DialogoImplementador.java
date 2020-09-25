package com.josrangel.dialogforalert;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class DialogoImplementador implements DialogInterface.OnClickListener {
    Context context;

    public DialogoImplementador(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == Dialog.BUTTON_POSITIVE){
            Toast.makeText(context,"Positivo", Toast.LENGTH_LONG).show();
        }
        if (which == Dialog.BUTTON_NEGATIVE){
            Toast.makeText(context,"Negativo", Toast.LENGTH_LONG).show();
        }
        if (which == Dialog.BUTTON_NEUTRAL){
            Toast.makeText(context,"Neutral", Toast.LENGTH_LONG).show();
        }
    }
}
