package com.AlexDim.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppActivity extends AppCompatActivity {

    //declaracion de ids activity

    private TextView txtResultado;

    private Button btnRestar, btnSumar, btnZoomMas, btnZoomMenos,btnOcultar,btnReset;

    private int count=0;
    private static int sizeText=30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnZoomMas = (Button) findViewById(R.id.btnZoomMas);
        btnZoomMenos = (Button) findViewById(R.id.btnZoomMenos);
        btnOcultar = (Button) findViewById(R.id.btnOcultar);
        btnReset = (Button) findViewById(R.id.btnReset);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtResultado.setText(count);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                txtResultado.setText(count);
            }
        });

        btnZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sizeText++;
                txtResultado.setTextSize(sizeText);
            }
        });

        btnZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sizeText--;
                txtResultado.setTextSize(sizeText);
            }
        });

        btnOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setVisibility(View.INVISIBLE);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                txtResultado.setText(count);
                txtResultado.setTextSize(30);
                txtResultado.setVisibility(View.VISIBLE);
            }
        });

    }
}