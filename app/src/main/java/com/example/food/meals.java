package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.databinding.MealsBinding;
import com.example.food.databinding.MenuBinding;

import java.util.ArrayList;

public class meals extends AppCompatActivity {

    private MealsBinding binding;

    static String fhs;
    static ArrayList<Tayps> scand = new ArrayList<>();
    static mealsAdaptoreqrbas2 mealsAdapterr1;
    static RecyclerView recyclerView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals);

        mealsAdaptoreqrbas mealsAdapterr;

        RecyclerView recyclerView;
        ArrayList<Tayps> first = new ArrayList<>();


        binding = MealsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.textView7.setText(getIntent().getStringExtra("ttt"));
        fhs=getIntent().getStringExtra("ttt");
        binding.textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  Intent i = new Intent(meals.this, meals.class);
            //    startActivity(i);

            }
        });



        mealsAdaptoreqrbas2 mealsAdaptoreqrbas1 = new mealsAdaptoreqrbas2(R.layout.tayp1_res,scand, this);
        mealsAdapterr1 =mealsAdaptoreqrbas1 ;

        recyclerView1 = binding.recyclerView;


        recyclerView1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView1.setAdapter(mealsAdapterr1);




        mealsAdaptoreqrbas mealsAdaptoreqrbas = new mealsAdaptoreqrbas(R.layout.meals_res, first, this);
        mealsAdapterr =mealsAdaptoreqrbas ;

        recyclerView = binding.recyclerView2;

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(mealsAdapterr);
        Tayps p = new Tayps();
        p.setImage(R.drawable.beriani);
        p.setText("Beriani");
        first.add(p);

        Tayps p2 = new Tayps();
        p2.setImage(R.drawable.mashawe);
        p2.setText("Mashawe");
        first.add(p2);

        Tayps p3 = new Tayps();
        p3.setImage(R.drawable.beurger);
        p3.setText("Burger");
        first.add(p3);

        Tayps p4 = new Tayps();
        p4.setImage(R.drawable.chekn);
        p4.setText("Chicken");
        first.add(p4);


        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(meals.this, MainActivity.class);
                startActivity(i);

            }
        });



    }









    }









