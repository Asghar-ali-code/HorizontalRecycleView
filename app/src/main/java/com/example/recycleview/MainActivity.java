package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        featuredRecycler= findViewById(R.id.featured_recycler);

        featuredRecycler();
    }

    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ArrayList<FeaturedHelperClass> featuredLocations= new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.hajj1,"Hajj","Lorem ispum consectetur adipiscing Lorem ispum consectetur adipiscing"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.hajj3,"Sec","Lorem ispum consectetur adipiscing Lorem ispum consectetur adipiscing"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.hajj2,"Third","Lorem ispum consectetur adipiscing Lorem ispum consectetur adipiscing"));
        adapter = new  FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }
}