package com.example.muhammedraheezrahman.nestedrecyclerview.RecyclerAdapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.muhammedraheezrahman.nestedrecyclerview.R;

import java.util.List;

class ViewHolder extends RecyclerView.ViewHolder{

    RecyclerView rv;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        rv = (RecyclerView) itemView.findViewById(R.id.recyclerView2);
    }
}
public class RecyclerAdapter1 extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    int size =12;
    List<String> list;

    public RecyclerAdapter1(Context context,List<String> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item1,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        RecyclerAdapter2 adapter2 = new RecyclerAdapter2(context,list);
        LinearLayoutManager lm = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        viewHolder.rv.setLayoutManager(lm);
        viewHolder.rv.setAdapter(adapter2);

    }

    @Override
    public int getItemCount() {
        return size;
    }
}
