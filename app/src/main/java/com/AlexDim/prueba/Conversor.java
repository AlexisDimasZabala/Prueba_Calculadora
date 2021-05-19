package com.AlexDim.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {

    //declaracion de ids activity
    //Button
    private Button btnConversorConvertir, btnConversorReset;
    //Textos de entrada
    private EditText pltxtConversorMonto, pltxtConversorResultado;
    //Radio button seleccion
    private RadioGroup radioGroupMonedas;
    private RadioButton rdConversorDolar, rdConversorEuro, rdConversorReal;

    //Monedas con valores
    private final float dolar = 94.02f;
    private final float euro = 113.59f;
    private final float real = 17.71f;

    //variable resultado
    private float resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        btnConversorConvertir = (Button) findViewById(R.id.btnConversorConvertir);
        btnConversorReset = (Button) findViewById(R.id.btnConversorReset);

        pltxtConversorMonto = (EditText) findViewById(R.id.pltxtConversorMonto);
        pltxtConversorResultado = (EditText) findViewById(R.id.pltxtConversorResultado);

        radioGroupMonedas = (RadioGroup) findViewById(R.id.radioGroupMonedas);
        rdConversorDolar = (RadioButton) findViewById(R.id.rdConversorDolar);
        rdConversorEuro = (RadioButton) findViewById(R.id.rdConversorEuro);
        rdConversorReal = (RadioButton) findViewById(R.id.rdConversorReal);

        btnConversorConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cotizar();
            }
        });

        btnConversorReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pltxtConversorMonto.setText("");
                pltxtConversorResultado.setText("");
            }
        });
    }

    public void cotizar() {

        float entradaMonto = 0, salidaMonto = 0;

        entradaMonto = Float.parseFloat(pltxtConversorMonto.getText().toString());

        if (pltxtConversorMonto.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese un monto", Toast.LENGTH_SHORT).show();
        }

        if (rdConversorDolar.isChecked()) {
            salidaMonto = entradaMonto / dolar;
        }
        if (rdConversorEuro.isChecked()) {
            salidaMonto = entradaMonto / euro;
        }
        if (rdConversorReal.isChecked()) {
            salidaMonto = entradaMonto / real;
        }

        pltxtConversorResultado.setText(String.valueOf(salidaMonto));

    }
}