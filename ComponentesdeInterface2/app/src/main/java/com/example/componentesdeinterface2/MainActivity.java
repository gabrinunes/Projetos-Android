package com.example.componentesdeinterface2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkEstado;
    private TextView textEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleEstado = findViewById(R.id.toggleButtonEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkEstado = findViewById(R.id.checkBoxEstado);
        textEstado = findViewById(R.id.resultadoEstado);


    }



    public void enviar(View view){

        if(checkEstado.isChecked()){
            textEstado.setText("checkBox ligado");
        }else{
            textEstado.setText("checkBox desligado");
        }

    }


}
