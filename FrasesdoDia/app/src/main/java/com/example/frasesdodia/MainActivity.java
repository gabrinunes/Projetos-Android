package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase (View view){

        String [] frases ={
                "É pra frente que se anda, é pra cima que se olha e é lutando que se conquista. ",
                "As melhores coisas da vida são gratuitas: abraços, sorrisos, amigos, beijos, família, dormir, amor, risos e boas lembranças.",
                "Ciclo da vida: tentar, cair, levantar, recomeçar. Nunca desistir.",
                "Treine sua mente para ver o lado bom de qualquer situação.",
                "Um dia você ainda vai olhar para trás e ver que os problemas eram, na verdade, os degraus que te levaram à vitória. "
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.text_resultado);

        texto.setText(frases[numero]);
    }
}
