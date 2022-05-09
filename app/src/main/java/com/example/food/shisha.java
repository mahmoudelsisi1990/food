package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.databinding.ShishaBinding;
import com.example.food.databinding.ValetBinding;

import java.util.ArrayList;

public class shisha extends AppCompatActivity {


    public ShishaBinding binding;

    public ValetBinding binding1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shisha);




        binding = ShishaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding1 = ValetBinding.inflate(getLayoutInflater());
        View vsiew = binding.getRoot();
        setContentView(view);

        servicesAdaptoreqrbas personAdapterr;
        RecyclerView recyclerView;

        ArrayList<Tayps> per = new ArrayList<>();



        //titale = findViewById(R.id.);
        servicesAdaptoreqrbas personAdaptoreqrbas = new servicesAdaptoreqrbas(R.layout.services_tayp, per, this);

        personAdapterr = personAdaptoreqrbas;
        recyclerView = binding.shishaRv;

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(personAdapterr);
        Tayps p = new Tayps();
        p.setImage(R.drawable.coal);
        p.setText("Coal");
        per.add(p);

        Tayps p2 = new Tayps();
        p2.setImage(R.drawable.group_11394);
        p2.setText("Tips");
        per.add(p2);



        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(shisha.this, MainActivity.class);
                startActivity(i);

            }
        });








    }












}
