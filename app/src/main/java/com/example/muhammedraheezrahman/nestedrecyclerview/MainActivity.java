package com.example.muhammedraheezrahman.nestedrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.muhammedraheezrahman.nestedrecyclerview.RecyclerAdapters.RecyclerAdapter1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public List<String> string_list;
    public RecyclerAdapter1 adapter;
    public LinearLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        llm = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(llm);
        string_list = new ArrayList<>();
        string_list.add("HI");
        string_list.add("How");
        string_list.add("you ");
        string_list.add("doing");
        string_list.add("bro");
        adapter = new RecyclerAdapter1(getApplicationContext(),string_list);
        recyclerView.setAdapter(adapter);

    }
}
