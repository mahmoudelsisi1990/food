package com.example.food;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class servicesAdaptoreqrbas extends RecyclerView.Adapter<servicesAdaptoreqrbas.Holder> implements Filterable {
    ArrayList<Tayps> personal;
    Context context;
    int layout;

    @Override
    public Filter getFilter() {
        return null;
    }

    class Holder extends RecyclerView.ViewHolder {
      //  TextView titale;
        ImageView image1;
         TextView text ;

        public Holder(@NonNull View itemView) {
            super(itemView);
            text =itemView.findViewById(R.id.textvalet);
                image1 = itemView.findViewById(R.id.imagevalet);
        }
    }

    public servicesAdaptoreqrbas(int layout, ArrayList<Tayps> pesonal, Context context) {
        this.personal = pesonal;
        this.context = context;
        this.layout = layout;

    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent,false);
        return new Holder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final Holder holder, final int position) {
        final Tayps person = personal.get(position);
       holder.text.setText(person.getText());
        Glide.with(context).load(personal.get(position).image).into(holder.image1);


    }

    @Override
    public int getItemCount() {
        return personal.size();
    }
}
