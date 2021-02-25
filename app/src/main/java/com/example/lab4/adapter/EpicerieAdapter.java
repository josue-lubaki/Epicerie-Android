package com.example.lab4.adapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab4.Epicerie;
import com.example.lab4.R;
import com.example.lab4.model.ModelEpicerie;

import java.util.List;

public class EpicerieAdapter extends RecyclerView.Adapter<EpicerieAdapter.EpicerieVH> {

    Context context;
    private List<ModelEpicerie> listeEpicerie;

    public EpicerieAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public EpicerieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.epicerie_item,parent,false);

        return new EpicerieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EpicerieVH holder, int position) {
         ModelEpicerie epicerie = listeEpicerie.get(position);
         holder.title.setText(epicerie.getNom());
         holder.description.setText(epicerie.getDescription());
         holder.icon.setImageResource(epicerie.getIcon());

    }

    public void addEpicerie(List<ModelEpicerie> uneListe){
        listeEpicerie = uneListe;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.listeEpicerie.size();
    }

    static class EpicerieVH extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener{
        private ImageView icon;
        private TextView title;
        private TextView description;
        private CardView cardview;

        public EpicerieVH(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon);
            title= itemView.findViewById(R.id.produit_titre);
            description= itemView.findViewById(R.id.produit_desc);
            cardview = itemView.findViewById(R.id.cardview);
            cardview.setOnCreateContextMenuListener(this);
        }


        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("select an action");
            menu.add(getAdapterPosition(), 101, 0,"Edit an item");
            menu.add(getAdapterPosition(), 102, 1,"Delete an item");


        }
    }
}
