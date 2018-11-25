package com.example.muhammedraheezrahman.nestedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.muhammedraheezrahman.nestedrecyclerview.RecyclerAdapters.RecyclerAdapter1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView1;
    public List<String> string_list;
    public RecyclerAdapter1 adapter;
    public LinearLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView1 = (RecyclerView)findViewById(R.id.recyclerView);
        llm = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(llm);
        recyclerView1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));


        //contents to fill the inner recycler view
        string_list = new ArrayList<>();
        string_list.add("Item 1");
        string_list.add("Item 2");
        string_list.add("Item 3 ");
        string_list.add("Item 4");
        string_list.add("Item 5");
        adapter = new RecyclerAdapter1(getApplicationContext(),string_list);
        recyclerView1.setAdapter(adapter);

    }
}
