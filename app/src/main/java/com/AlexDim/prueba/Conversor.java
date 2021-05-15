package com.AlexDim.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Conversor extends AppCompatActivity {

    //declaracion de ids activity
        //Buttons
    private Button btnConversorConvertir, btnConversorReset;
        //Textos de entrada
    private EditText pltxtConversorMonto, pltxtConversorResultado;
        //Radio button seleccion
    private RadioButton rdConversorDolar, rdConversorEuro, rdConversorReal;

    //Monedas con valores
    private Float Dolar = 94.02f;
    private Float Euro = 113.59f;
    private Float Real = 17.71f;

    //variable resultado
    private float resultado=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        btnConversorConvertir = (Button) findViewById(R.id.btnConversorConvertir);
        btnConversorReset = (Button) findViewById(R.id.btnConversorReset);

        pltxtConversorMonto = (EditText) findViewById(R.id.pltxtConversorMonto);
        pltxtConversorResultado = (EditText) findViewById(R.id.pltxtConversorResultado);

        rdConversorDolar = (RadioButton) findViewById(R.id.rdConversorDolar);
        rdConversorEuro = (RadioButton) findViewById(R.id.rdConversorEuro);
        rdConversorReal = (RadioButton) findViewById(R.id.rdConversorReal);

        btnConversorConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked(v);
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
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        float value=0;
        String temp=pltxtConversorMonto.getText().toString();
        value = Float.parseFloat(temp);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdConversorReal:
                if (checked)
                    // Convierto moneda
                    resultado = value * Real;
                break;
            case R.id.rdConversorDolar:
                if (checked)
                    // Convierto moneda
                    resultado = value * Dolar;
                break;
            case R.id.rdConversorEuro:
                if (checked)
                    // Convierto moneda
                    resultado = value * Euro;
                break;
        }
    }
}