package com.example.food;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class menuAdaptoreqrbas extends RecyclerView.Adapter<menuAdaptoreqrbas.Holder> implements Filterable {
    ArrayList<Tayps> personal;
    Context context;
    int layout;

    int  selectedPosition = -1 ;

    @Override
    public Filter getFilter() {
        return null;
    }

    class Holder extends RecyclerView.ViewHolder {
      //  TextView titale;
        ImageView image1;
        ImageView image2;
        ImageView image3;

        TextView text1;
        TextView text2;
        TextView text3;

        public Holder(@NonNull View itemView) {
            super(itemView);
           //titale=itemView.findViewById(R.id.texttayp1);
            if(layout==R.layout.tayp1_res) {
                image1 = itemView.findViewById(R.id.imageViewtayp1);
                text1 = itemView.findViewById(R.id.textV1iewtayp2);
            }

            else{
                image1 = itemView.findViewById(R.id.big);
                image2 = itemView.findViewById(R.id.small1);
                image3 = itemView.findViewById(R.id.small2);
                text1 = itemView.findViewById(R.id.textV1iewtayp2);
                text2 = itemView.findViewById(R.id.textView2tayp2);
                text3 = itemView.findViewById(R.id.textView3tayp2);
            }
        }
    }

    public menuAdaptoreqrbas(int layout, ArrayList<Tayps> pesonal, Context context) {
        this.personal = pesonal;
        this.context = context;
        this.layout = layout;

    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent,false);
        if(viewType==1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tayp1_res, parent,false);
        }else if(viewType==2){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tayp2_res, parent,false);
        }else if(viewType==3){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tayp3_res, parent,false);
        }
        return new Holder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final Holder holder, @SuppressLint("RecyclerView") final int position) {
        final Tayps person = personal.get(position);
       //holder.titale.setText(person.getText());

        if(layout==R.layout.tayp1_res) {
            Glide.with(context).load(personal.get(position).image).into(holder.image1);
            holder.text1.setText(personal.get(position).getText());

        }

        else{
            Glide.with(context).load(personal.get(position).image).into(holder.image1);
            Glide.with(context).load(personal.get(position).imagea).into(holder.image2);
            Glide.with(context).load(personal.get(position).imageb).into(holder.image3);
            holder.text1.setText(personal.get(position).getText());
            holder.text2.setText(personal.get(position).getText2());
            holder.text3.setText(personal.get(position).getText3());


            holder.image2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(holder.itemView.getContext(), meals.class);
                    i.putExtra("ttt",holder.text2.getText());
                    holder.itemView.getContext().startActivity(i);
                }
            });


            holder.image3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(holder.itemView.getContext(), meals.class);
                    i.putExtra("ttt",holder.text3.getText());
                    holder.itemView.getContext().startActivity(i);
                }
            });




        }



        holder.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(holder.itemView.getContext(), meals.class);
                i.putExtra("ttt",holder.text1.getText());
                holder.itemView.getContext().startActivity(i);
            }
        });


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedPosition=position;
                notifyDataSetChanged();
            }
        });


        if(selectedPosition==0) {



        }


    }


    @Override
    public int getItemCount() {
        return personal.size();
    }

    @Override
    public int getItemViewType(int position) {

        int mod =  position% 2 ;

         if (position == 0 ) {

            layout = (R.layout.tayp1_res) ;
             return 1;
         } else  if (mod == 1 ) {

             layout = (R.layout.tayp2_res) ;
             return 2;
         }else  {

             layout = (R.layout.tayp3_res) ;
            return 3;
         }

    }


    private int doToPx(int dp) {
        float px = dp * context.getResources().getDisplayMetrics().density;
        return (int) px;
    }


}
