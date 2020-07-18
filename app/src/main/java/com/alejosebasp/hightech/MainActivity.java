package com.alejosebasp.hightech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_metas, rv_blog;
    private CardView cv_metas;
    private MetasAdapter adaptador_metas;
    private BlogAdapter adaptadorBlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_metas = (RecyclerView)findViewById(R.id.rv_metas);
        rv_blog = (RecyclerView)findViewById(R.id.rv_blog);
        cv_metas = (CardView)findViewById(R.id.cv_metas);

        //Datos metas
        ArrayList<Meta> metas = new ArrayList<>();
        metas.add(new Meta(R.mipmap.img_meta1_foreground, "Viaje a islas Canarias", 8000000, 1630000, 20));
        metas.add(new Meta(R.mipmap.img_meta2_foreground, "Macbook Pro", 7000000, 0, 0));

        LinearLayoutManager layoutManager_rv_metas = new LinearLayoutManager(this);
        layoutManager_rv_metas.setOrientation(RecyclerView.HORIZONTAL);
        rv_metas.setLayoutManager(layoutManager_rv_metas);

        adaptador_metas = new MetasAdapter(this, metas);
        rv_metas.setAdapter(adaptador_metas);

        //Datos entradas Blog
        ArrayList<Entrada> entradas = new ArrayList<>();
        entradas.add(new Entrada("10 gastos que debes evitar", "Aunque el 66% de los adultos recibió educación para el ahorro, apenas el 44% ahorra de manera fomal.", R.mipmap.img_blog_foreground));
        entradas.add(new Entrada("10 gastos que debes evitar", "Aunque el 66% de los adultos recibió educación para el ahorro, apenas el 44% ahorra de manera fomal.", R.mipmap.img_blog_foreground));
        entradas.add(new Entrada("10 gastos que debes evitar", "Aunque el 66% de los adultos recibió educación para el ahorro, apenas el 44% ahorra de manera fomal.", R.mipmap.img_blog_foreground));
        LinearLayoutManager layoutManager_rv_blog = new LinearLayoutManager(this);
        rv_blog.setLayoutManager(layoutManager_rv_blog);
        adaptadorBlog = new BlogAdapter(entradas);
        rv_blog.setAdapter(adaptadorBlog);
    }
}
