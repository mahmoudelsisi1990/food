package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.databinding.ServicesBinding;

import java.util.ArrayList;

public class services extends AppCompatActivity {

    private ServicesBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services);




        binding = ServicesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        servicesAdaptoreqrbas personAdapterr;
        RecyclerView recyclerView;
        ArrayList<Tayps> per = new ArrayList<>();



        //titale = findViewById(R.id.);
        servicesAdaptoreqrbas personAdaptoreqrbas = new servicesAdaptoreqrbas(R.layout.services_tayp, per, this);

        personAdapterr = personAdaptoreqrbas;
        recyclerView = binding.serRv;

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        recyclerView.setAdapter(personAdapterr);
        Tayps p = new Tayps();
        p.setImage(R.drawable.waiter);
        p.setText("waiter");
        per.add(p);

        Tayps p2 = new Tayps();
        p2.setImage(R.drawable.ice);
        p2.setText("ice");
        per.add(p2);

        Tayps p3 = new Tayps();
        p3.setImage(R.drawable.ketchup);
        p3.setText("ketchup");
        per.add(p3);

        Tayps p4 = new Tayps();
        p4.setImage(R.drawable.mayonaise);
        p4.setText("mayonaise");
        per.add(p4);

        Tayps p5 = new Tayps();
        p5.setImage(R.drawable.ashtray);
        p5.setText("ashtray");
        per.add(p5);

        Tayps p6 = new Tayps();
        p6.setImage(R.drawable.manager);
        p6.setText("manager");
        per.add(p6);


        binding.imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(services.this, MainActivity.class);
                startActivity(i);

            }
        });








    }


}
