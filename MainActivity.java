package com.example.delta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this));
        SimpleAdapter adapter = new SimpleAdapter(generateList());
        rv.setAdapter(adapter);
    }

    private List<ListItem> generateList() {
        List<ListItem> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new ListItem(String.valueOf(i)));
        }
        return list;
    }
}
