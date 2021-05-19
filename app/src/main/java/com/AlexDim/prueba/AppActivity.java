package com.AlexDim.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                sumar();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restar();
            }
        });

        btnZoomMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomMas();
            }
        });

        btnZoomMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomMenos();
            }
        });

        btnOcultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ocultar();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }

    private void sumar(){
        count++;
        txtResultado.setText(String.valueOf(count));
    }
    private void restar(){
        if(count==0) {Toast.makeText(getApplicationContext(),"No se puede restar",Toast.LENGTH_SHORT).show(); return;}
        count--;
        txtResultado.setText(String.valueOf(count));
    }
    private void zoomMas(){
        sizeText++;
        txtResultado.setTextSize(sizeText);
    }
    private void zoomMenos(){
        sizeText--;
        txtResultado.setTextSize(sizeText);
    }
    private void ocultar(){
        if(txtResultado.getVisibility()==View.VISIBLE){
            txtResultado.setVisibility(View.INVISIBLE);
        }else{
            txtResultado.setVisibility(View.VISIBLE);
        }
    }
    private void reset(){
        count=0;
        sizeText=30;
        txtResultado.setText(String.valueOf(count));
        txtResultado.setTextSize(sizeText);
        txtResultado.setVisibility(View.VISIBLE);
    }
}