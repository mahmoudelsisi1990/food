package com.example.food;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class mealsAdaptoreqrbas extends RecyclerView.Adapter<mealsAdaptoreqrbas.Holder> implements Filterable {
    ArrayList<Tayps> personal;
    Context context;
    int layout;
    int  selectedPosition = -1 ;
    boolean flag=true;
    @Override
    public Filter getFilter() {
        return null;
    }

    class Holder extends RecyclerView.ViewHolder {
      //  TextView titale;
        ImageView image1;
         TextView text ;
         CardView card ;

        public Holder(@NonNull View itemView) {
            super(itemView);
            text =itemView.findViewById(R.id.textvalet);
                image1 = itemView.findViewById(R.id.imagevalet);
          card = itemView.findViewById(R.id.valet);
        }
    }

    public mealsAdaptoreqrbas(int layout, ArrayList<Tayps> pesonal, Context context) {
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
    public void onBindViewHolder(@NonNull final Holder holder, @SuppressLint("RecyclerView") final int position) {
        final Tayps person = personal.get(position);
       holder.text.setText(person.getText());
        Glide.with(context).load(personal.get(position).image).into(holder.image1);

        if( holder.text.getText().equals(meals.fhs) && flag){
            holder.itemView.setSelected(true);
            selectedPosition=position;
            meals.scand.clear();
            Tayps s = new Tayps();
            s.setImage(R.drawable.s4);
            s.setText(holder.text.getText().toString()+"1");
            meals.scand.add(s);

            Tayps s2 = new Tayps();
            s2.setImage(R.drawable.s3);
            s2.setText(holder.text.getText().toString()+"2");
            meals.scand.add(s2);

            Tayps s3 = new Tayps();
            s3.setImage(R.drawable.s2);
            s3.setText(holder.text.getText().toString()+"3");
            meals.scand.add(s3);

            Tayps s4 = new Tayps();
            s4.setImage(R.drawable.s1);
            s4.setText(holder.text.getText().toString()+"4");
            meals.scand.add(s4);
            meals.mealsAdapterr1.notifyDataSetChanged();
        }else{
            holder.itemView.setSelected(false);
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                flag=false;
                selectedPosition=position;
            notifyDataSetChanged();
                meals.scand.clear();
                Tayps s = new Tayps();
                s.setImage(R.drawable.s4);
                s.setText(holder.text.getText().toString()+"1");
                meals.scand.add(s);

                Tayps s2 = new Tayps();
                s2.setImage(R.drawable.s3);
                s2.setText(holder.text.getText().toString()+"2");
                meals.scand.add(s2);

                Tayps s3 = new Tayps();
                s3.setImage(R.drawable.s2);
                s3.setText(holder.text.getText().toString()+"3");
                meals.scand.add(s3);

                Tayps s4 = new Tayps();
                s4.setImage(R.drawable.s1);
                s4.setText(holder.text.getText().toString()+"4");
                meals.scand.add(s4);
                meals.mealsAdapterr1.notifyDataSetChanged();
        }
    });


        if(selectedPosition==position){

            // user ClickOn item
            //holder.itemView.setBackgroundColor(Color.parseColor("#059245"));
            holder.image1.setBackgroundColor(Color.parseColor("#059245"));
            holder.card.setCardBackgroundColor(Color.parseColor("#059245"));
            holder.text.setTextColor(Color.parseColor("#ffffff"));

        }else{
            holder.image1.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.card.setCardBackgroundColor(Color.parseColor("#ffffff"));
            holder.text.setTextColor(Color.parseColor("#000000"));
            holder.image1.setBackgroundColor(Color.parseColor("#ffffff"));
        }














}

    @Override
    public int getItemCount() {
        return personal.size();
    }
}
