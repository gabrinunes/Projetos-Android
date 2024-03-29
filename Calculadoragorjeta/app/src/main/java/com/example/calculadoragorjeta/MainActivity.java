package com.example.calculadoragorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textPorcentagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekGorjeta;
    private double porcentagem =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editValor = findViewById(R.id.editValor);
         textPorcentagem = findViewById(R.id.textPorcentagem);
         textGorjeta = findViewById(R.id.textGorjeta);
         textTotal = findViewById(R.id.textResultado);
         seekGorjeta = findViewById(R.id.seekGorjeta);

         seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             @Override
             public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                 calcular();
                 porcentagem = seekBar.getProgress();
                 textPorcentagem.setText( Math.round(porcentagem) +"%");

             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {

             }
         });


    }

    public void calcular(){


        Double valorDigitado = Double.parseDouble(editValor.getText().toString());

        double gorjeta = valorDigitado * (porcentagem/100);
        double total = gorjeta + valorDigitado;

        textGorjeta.setText("R$ " +  Math.round(gorjeta));
        textTotal.setText("R$ " +total);
    }

}
