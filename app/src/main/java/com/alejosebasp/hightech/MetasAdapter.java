package com.alejosebasp.hightech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MetasAdapter extends RecyclerView.Adapter<MetasAdapter.MetasViewHolder> {

    private ArrayList<Meta> metas;
    private Context context;

    public MetasAdapter(Context context, ArrayList<Meta> metas) {
        this.metas = metas;
        this.context = context;
    }

    @NonNull
    @Override
    public MetasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cv_metas, parent, false);

        return new MetasViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull MetasViewHolder holder, int position) {

        final Meta meta = metas.get(position);

        holder.img_meta.setImageResource(meta.getId_img());
        holder.tv_nombre_meta.setText(meta.getNombre());
        holder.tv_valor1.setText("$".concat(String.valueOf((int)meta.getValor1())));
        holder.tv_valor2.setText("$".concat(String.valueOf((int)meta.getValor2())));
        holder.pb_meta.setVisibility(View.VISIBLE);
        holder.pb_meta.setProgress(meta.getAvance());
        int porcentaje = (int)((int)meta.getValor2()*100/meta.getValor1());
        holder.tv_por_metas.setText(String.valueOf(porcentaje).concat("%"));
    }

    @Override
    public int getItemCount() {
        return metas.size();
    }

    public class MetasViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_nombre_meta, tv_valor1, tv_valor2, tv_por_metas;
        private ImageView img_meta;
        private ProgressBar pb_meta;

        public MetasViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nombre_meta = itemView.findViewById(R.id.tv_nombre_meta);
            tv_valor1 = itemView.findViewById(R.id.tv_valor1);
            tv_valor2 = itemView.findViewById(R.id.tv_valor2);
            img_meta = itemView.findViewById(R.id.img_meta);
            pb_meta = itemView.findViewById(R.id.pb_metas);
            tv_por_metas = itemView.findViewById(R.id.tv_por_metas);
        }
    }
}
