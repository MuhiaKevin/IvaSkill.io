package com.myfirstapp.muhia.ivaskillio;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TechnologiesAdapter extends RecyclerView.Adapter<TechnologiesAdapter.TechnologiesViewHolder> {

    List <Technologies_model> list_technologies;


    public TechnologiesAdapter(List <Technologies_model> list_technologies){
        this.list_technologies = list_technologies;
    }


    @Override
    public TechnologiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_techonologies, parent, false);

        return new TechnologiesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TechnologiesViewHolder holder, int position) {
        Technologies_model tech = list_technologies.get(position);
        holder.title.setText(tech.getTitle());
        holder.rank.setText(tech.getRank());
        holder.link.setText(tech.getLink());

    }

    @Override
    public int getItemCount() {
        return list_technologies.size();
    }


    public class TechnologiesViewHolder extends RecyclerView.ViewHolder {
        TextView title, rank, link;

        public TechnologiesViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_textView);
            rank = itemView.findViewById(R.id.rank_textView);
            link = itemView.findViewById(R.id.link_textView);
        }
    }


}




