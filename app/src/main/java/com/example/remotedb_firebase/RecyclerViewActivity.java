package com.example.remotedb_firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListPlanets> listPlanets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listPlanets = new ArrayList<>();
        for (int i=0; i<=10; i++){
            ListPlanets listPlanet = new ListPlanets("heading " + (i+1), "lorem text");
            listPlanets.add(listPlanet);
        }

        adapter = new MyAdapter(listPlanets, this);
        recyclerView.setAdapter(adapter);



    }
}
