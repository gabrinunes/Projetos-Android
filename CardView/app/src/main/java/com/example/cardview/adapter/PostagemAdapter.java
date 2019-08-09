package com.example.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagems;

    public PostagemAdapter(List<Postagem> listaPostagem) {
      this.postagems = listaPostagem;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        Postagem postagem = postagems.get(position);

        myViewHolder.textnome.setText(postagem.getNome());
        myViewHolder.textpostagem.setText(postagem.getPostagem());
        myViewHolder.imagePostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textnome;
        private TextView textpostagem;
        private ImageView imagePostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textnome = itemView.findViewById(R.id.textNome);
            textpostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);

        }
    }
}
