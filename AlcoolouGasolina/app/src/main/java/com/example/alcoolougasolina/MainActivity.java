package com.example.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

      private EditText edPrecoAlcool ;
     private EditText edtPrecoGasolina;
     private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       edPrecoAlcool = findViewById(R.id.editPrecoAlcool2);
       edtPrecoGasolina = findViewById(R.id.editPrecoGasolina2);
       txtResultado = findViewById(R.id.textResultado);


    }

    public void CalculaPreco(View view){

        String PrecoAlcool = edPrecoAlcool.getText().toString();
        String PrecoGasolina = edtPrecoGasolina.getText().toString();

        Boolean camposValidados = this.ValidarCampos(PrecoAlcool,PrecoGasolina);

        if(camposValidados){
            this.CalcularMelhorPreco(PrecoAlcool,PrecoGasolina);

        }else {
            txtResultado.setText("Preencha os Preços Primeiro");
        }

    }

    public void CalcularMelhorPreco(String pAlcool,String PGasolina){

        Double PrecoAlcool = Double.parseDouble(pAlcool);
        Double PrecoGasolina= Double.parseDouble(PGasolina);

        Double resultado = PrecoAlcool / PrecoGasolina;

        if(resultado >=0.7){
            txtResultado.setText("Melhor Utilizar Gasolina");
        }else {
            txtResultado.setText("Melhor Utilizar Alcool");
        }

    }

    public Boolean ValidarCampos(String pAlcool,String pGasolina){

        Boolean camposValidados = true;

        if(pAlcool==null|| pAlcool.equals("")){
            camposValidados=false;
        }else if(pGasolina==null|| pGasolina.equals("")){
            camposValidados=false;
        }

        return camposValidados;
    }
}
