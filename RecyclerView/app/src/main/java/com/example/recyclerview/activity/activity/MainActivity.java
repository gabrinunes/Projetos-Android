package com.example.recyclerview.activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.RecyclerItemClickListener;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        this.CriarFilmes();
        //Configurar Adapter

        Adapter adapter = new Adapter(listaFilmes);


        //Configurar RecycleView

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);


        //Configurar Evento de click

        recyclerView.addOnItemTouchListener(
           new RecyclerItemClickListener(
                   getApplicationContext(),
                   recyclerView,
                   new RecyclerItemClickListener.OnItemClickListener() {
                       @Override
                       public void onItemClick(View view, int position) {
                           Filme filme = listaFilmes.get(position);
                           Toast.makeText(
                                   getApplicationContext(),
                                   "Item pressionado: " +filme.getTituloFilme(),
                                   Toast.LENGTH_SHORT
                           ).show();
                       }

                       @Override
                       public void onLongItemClick(View view, int position) {
                           Filme filme = listaFilmes.get(position);
                           Toast.makeText(
                                 getApplicationContext(),
                                 "Click Longo: " +filme.getTituloFilme(),
                                 Toast.LENGTH_SHORT
                         ).show();
                       }

                       @Override
                       public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                       }
                   }
           )
        );
    }

    public void CriarFilmes(){
        Filme filme = new Filme("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

         filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

         filme = new Filme("Liga da Justiça","Ficção","2017");
        this.listaFilmes.add(filme);

         filme = new Filme("Capitão América - Guerra Civíl","Aventura/Ficção","2016");
        this.listaFilmes.add(filme);

         filme = new Filme("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Pica-Pau: O Filme","Comédia/Animação","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("A Múmia","Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("A Bela e a Fera","Romance","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Meu Malvado favorito 3","Comédia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Carros 3","Comédia","2017");
        this.listaFilmes.add(filme);



    }
}
