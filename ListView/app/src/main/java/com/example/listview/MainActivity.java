package com.example.listview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] item = {
            "Angra dos Reis","Belém do Pará",
            "Campos do Jordão","Rio de Janeiro",
            "Salinas","Algoodoal",
            "Goianapolis","Minas Gerais",
            "São Paulo","Campinas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Cria Adaptador da lista
        ArrayAdapter<String>adaptador = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                item){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(android.R.id.text1);
                text.setTextColor(Color.BLACK);
                return view;
            }
        };

         //Adiciona Adaptador para a lista

        listLocais.setAdapter(adaptador);

        //Adiciona evento de clique na lista

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_LONG).show();
            }
        });
    }
}
