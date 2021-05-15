package com.AlexDim.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class AppActivity extends AppCompatActivity {

    //declaracion de ids activity

    private Button btnRestar, btnSumar, btnZoomMas, btnZoomMenos,btnOcultar,btnReset;

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
    }
}