package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.databinding.HomeBinding;
import com.example.food.databinding.MealsBinding;
import com.example.food.databinding.MenuBinding;

import java.util.ArrayList;

public class menu extends AppCompatActivity {

    private MenuBinding binding;
    public MealsBinding binding1;
    public static ArrayList<Tayps> per = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        menuAdaptoreqrbas personAdapterr;
  //      mealsAdaptoreqrbas mealsAdapterr;
        RecyclerView recyclerView;



        ArrayList<Tayps> first = new ArrayList<>();

        binding = MenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(menu.this, meals.class);
                startActivity(i);

            }
        });


        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(menu.this, MainActivity.class);
                startActivity(i);

            }
        });



        //titale = findViewById(R.id.);
        menuAdaptoreqrbas menuAdaptoreqrbas = new menuAdaptoreqrbas(R.layout.tayp1_res, per, this);

        personAdapterr = menuAdaptoreqrbas;
        recyclerView = binding.rvmenu;
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(personAdapterr);
        Tayps p = new Tayps();
        p.setImage(R.drawable.menu_1);
        p.setText("Mashawe");
        per.add(p);

        Tayps p1 = new Tayps();
        p1.setText("Chicken");
        p1.setText2("Burger");
        p1.setText3("Beriani");
        p1.setImage(R.drawable.b1);
        p1.setImagea(R.drawable.s2);
        p1.setImageb(R.drawable.s3);
        per.add(p1);

        Tayps p2 = new Tayps();
        p2.setImage(R.drawable.b2);
        p2.setText("test");
        p2.setText2("test");
        p2.setText3("test");
        p2.setImagea(R.drawable.s4);
        p2.setImageb(R.drawable.s3);
        per.add(p2);

        Tayps p3 = new Tayps();
        p3.setText("test");
        p3.setText2("test");
        p3.setText3("test");
        p3.setImagea(R.drawable.s2);
        p3.setImageb(R.drawable.s1);
        p3.setImage(R.drawable.s4);
        per.add(p3);











      // mealsAdaptoreqrbas mealsAdaptoreqrbas = new mealsAdaptoreqrbas(R.layout.meals_res, first, this);
    //    mealsAdapterr =mealsAdaptoreqrbas ;
   //   recyclerView = binding1.recyclerView2;

//        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
//        recyclerView.setAdapter(mealsAdapterr);
//        Tayps s = new Tayps();
//        s.setImage(R.drawable.beriani);
//        s.setText("Beriani");
//        first.add(s);
//
//        Tayps s2 = new Tayps();
//        s2.setImage(R.drawable.mashawe);
//        s2.setText("mashawe");
//        first.add(s2);
//
//        Tayps s3 = new Tayps();
//        s3.setImage(R.drawable.beurger);
//        s3.setText("Burger");
//        first.add(s3);
//
//        Tayps s4 = new Tayps();
//        s4.setImage(R.drawable.chekn);
//        s4.setText("Chicken");
//        first.add(s4);












    }


}
