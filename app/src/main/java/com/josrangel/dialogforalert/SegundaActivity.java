package com.josrangel.dialogforalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        textView = findViewById(R.id.textView);
        String nombrePerro = getIntent().getStringExtra(MiAdaptador.EXTRA_PERRO);
        textView.setText(nombrePerro);

    }
}