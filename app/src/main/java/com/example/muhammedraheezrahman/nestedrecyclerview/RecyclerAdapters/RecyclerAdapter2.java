package com.example.muhammedraheezrahman.nestedrecyclerview.RecyclerAdapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.muhammedraheezrahman.nestedrecyclerview.R;

import java.util.List;

class ViewHolder2 extends RecyclerView.ViewHolder{

    TextView tv;
    public ViewHolder2(@NonNull View itemView) {
        super(itemView);

        tv = (TextView) itemView.findViewById(R.id.tv);

    }
}

public class RecyclerAdapter2 extends RecyclerView.Adapter<ViewHolder2> {
    Context context;
    List<String> list;

    public RecyclerAdapter2(Context context,List<String> list) {
        this.context = context;
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item2,viewGroup,false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 viewHolder, int i) {

        viewHolder.tv.setText(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
