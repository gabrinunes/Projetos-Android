package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir Layout

        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        layoutManager.setOrientation(LinearLayout.VERTICAL);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);


        //Definir Adapter
        this.prepararPostagem();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);


    }

    public void prepararPostagem(){

        Postagem p = new Postagem("Gabriel cunha","Top",R.drawable.imagem1);
        this.postagens.add(p);

         p = new Postagem ("Gabriel cunha","Top",R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem  ("Gabriel cunha","Top",R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Gabriel cunha","Top",R.drawable.imagem4);
        this.postagens.add(p);
    }
}
