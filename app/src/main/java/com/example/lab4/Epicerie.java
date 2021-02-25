package com.example.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;
import android.view.MenuItem;

import com.example.lab4.adapter.EpicerieAdapter;
import com.example.lab4.model.ModelEpicerie;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class Epicerie extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epicerie);

        recyclerView = findViewById(R.id.recyclerview);
        EpicerieAdapter adapter = new EpicerieAdapter(getApplication());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplication()));
        adapter.addEpicerie(getAllEpicerie());
        recyclerView.setAdapter(adapter);

    }

    public List<ModelEpicerie> getAllEpicerie(){
        List<ModelEpicerie> uneListe= new ArrayList<>();
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        uneListe.add(new ModelEpicerie("yoo","vsdvdsv",R.drawable.t_icone ));
        return uneListe;

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
         super.onContextItemSelected(item);
         switch(item.getItemId()){
             case 101:
                 Snackbar.make(findViewById(R.id.rootId), "edited", Snackbar.LENGTH_LONG).show();

                 return true;

             case 102 :
                 Snackbar.make(findViewById(R.id.rootId), "deleted", Snackbar.LENGTH_LONG).show();

                 return true;

         }
         return true;

    }
}