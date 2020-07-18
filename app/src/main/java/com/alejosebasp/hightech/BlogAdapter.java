package com.alejosebasp.hightech;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.BlogAdapterHolder> {

    ArrayList<Entrada> entradas;

    public BlogAdapter(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

    @NonNull
    @Override
    public BlogAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cv_blog, parent, false);

        return new BlogAdapterHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull BlogAdapterHolder holder, int position) {
        final Entrada entrada = entradas.get(position);

        holder.tv_titulo.setText(entrada.getTitulo());
        holder.tv_descripcion.setText(entrada.getDescripcion());
        holder.img_entrada.setImageResource(entrada.getImagen());
    }

    @Override
    public int getItemCount() {
        return entradas.size();
    }

    public class BlogAdapterHolder extends RecyclerView.ViewHolder {
        private TextView tv_titulo, tv_descripcion;
        private ImageView img_entrada;

        public BlogAdapterHolder(@NonNull View itemView) {
            super(itemView);
            tv_titulo = itemView.findViewById(R.id.tv_titulo_blog);
            tv_descripcion = itemView.findViewById(R.id.tv_descrip_blog);
            img_entrada = itemView.findViewById(R.id.img_blog);
        }
    }
}
