package com.example.task_android4;

import android.graphics.Movie;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rv_adapter extends RecyclerView.Adapter<rv_adapter.AnimalsViewHolder> {

    ArrayList<animals> animal;

    public rv_adapter(ArrayList<animals> animal) {
        this.animal = animal;
    }

    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_animals, null, false);
        AnimalsViewHolder viewHolder = new AnimalsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsViewHolder holder, int position) {
        animals animals = animal.get(position);
        holder.name.setText(animals.getName());
        holder.description.setText(animals.getDescription());
        holder.image.setImageResource(animals.getImage());
        holder.card_View_animals.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.animation));
        MediaPlayer mediaPlayer = MediaPlayer.create(holder.itemView.getContext(), R.raw.sound);
        holder.card_View_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

    }

    @Override
    public int getItemCount() {

        return animal.size();
    }

    public void setAnimal(ArrayList<animals> animal) {
        this.animal = animal;
        notifyDataSetChanged();
    }

    class AnimalsViewHolder extends RecyclerView.ViewHolder {
        CardView card_View_animals;
        TextView name;
        TextView description;
        ImageView image;


        public AnimalsViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            image = itemView.findViewById(R.id.iv);
            card_View_animals = itemView.findViewById(R.id.card_view_animals);

        }
    }


}


