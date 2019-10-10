package com.example.remotedb_firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListPlanets> listPlanets;
    private Context context;

    public MyAdapter(List<ListPlanets> listPlanets, Context context) {
        this.listPlanets = listPlanets;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        //get the element of the list when you click it
        ListPlanets listPlanet = listPlanets.get(position);
        holder.tvHead.setText(listPlanet.getHead());
        holder.tvDescription.setText(listPlanet.getDescription());
    }

    @Override
    public int getItemCount() {
        return listPlanets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvHead, tvDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHead = (TextView)itemView.findViewById(R.id.textViewHead);
            tvDescription = (TextView)itemView.findViewById(R.id.textViewDesc);
        }
    }
}
