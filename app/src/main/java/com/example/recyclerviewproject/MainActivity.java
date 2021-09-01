package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        ArrayList<MyItem> list = new ArrayList<>();
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));
        list.add(new MyItem(R.drawable.ic_plane, "nilesh"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilu"));
        list.add(new MyItem(R.drawable.ic_plane, "nilu"));
        list.add(new MyItem(R.drawable.ic_sale, "Nrp"));
        list.add(new MyItem(R.drawable.ic_cam, "nrp"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));
        list.add(new MyItem(R.drawable.ic_cam, "Nilesh"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(list));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
}