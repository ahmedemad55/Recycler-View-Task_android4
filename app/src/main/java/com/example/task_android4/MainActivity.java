package com.example.task_android4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv_main);

        ArrayList<animals> animals = new ArrayList<>();
        animals.add(new animals(R.drawable.camel, "Camel", "The ship of the desert"));
        animals.add(new animals(R.drawable.cat, "Cat", "Is a beautiful pet animal"));
        animals.add(new animals(R.drawable.cow, "Cow", "We benefit from it on the farm"));
        animals.add(new animals(R.drawable.fox, "Fox", "A cunning and deceitful animal"));
        animals.add(new animals(R.drawable.crocodile, "Crocodile", "Is a ferocious and terrifying animal"));
        animals.add(new animals(R.drawable.dog, "Dog", "Is a loyal animal"));
        animals.add(new animals(R.drawable.goat, "Goat", "We benefit from it on the farm"));
        animals.add(new animals(R.drawable.horse, "Horse", "A very fast animal"));
        animals.add(new animals(R.drawable.lion, "Lion", "Is the king of the jungle"));
        animals.add(new animals(R.drawable.rat, "Rat", "A small and scary animal"));
        animals.add(new animals(R.drawable.sloth, "Sloth", "A very lazy animal"));
        animals.add(new animals(R.drawable.chicken, "Chicken", "We benefit from it on the farm"));



        rv_adapter adapter = new rv_adapter(animals);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);


    }
}