package com.example.food;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.app.UiModeManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food.databinding.HomeBinding;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private HomeBinding binding;
    private Dialog dialogl;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        UiModeManager uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);

//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);


        binding = HomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        HomeAdaptoreqrbas personAdapterr;
        RecyclerView recyclerView;
        ArrayList<Tayps> per = new ArrayList<>();
        //titale = findViewById(R.id.);
        HomeAdaptoreqrbas personAdaptoreqrbas = new HomeAdaptoreqrbas(R.layout.tayp_res, per, this);

        personAdapterr = personAdaptoreqrbas;
        recyclerView = binding.reclerEqtnasa;
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(personAdapterr);
        Tayps p = new Tayps();
        p.setImage(R.drawable.back1);
        per.add(p);

        binding.include2.imageView6.setOnClickListener(v -> {
            if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        });

        Tayps p2 = new Tayps();
        p2.setImage(R.drawable.bell);
        per.add(p2);

        Tayps p3 = new Tayps();
        p3.setImage(R.drawable.bg);
        per.add(p3);

        binding.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, menu.class);
                startActivity(i);

            }
        });



        binding.services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, services.class);
                startActivity(i);

            }
        });

        binding.shisha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, shisha.class);
                startActivity(i);

            }
        });

        binding.valet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, valet.class);
                startActivity(i);

            }
        });

        binding.feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, feedback.class);
                startActivity(i);

            }
        });





            binding.include2.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
                    integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                    integrator.setPrompt("اضافة طاولة");
                    integrator.setCameraId(0);
                    integrator.setBeepEnabled(true);
                    integrator.setBarcodeImageEnabled(true);
                    integrator.initiateScan();
                }
            });










        binding.include2.imageView5.setOnClickListener(v -> {

            showdialogl() ;

        });








    }
    private void showdialogl()   {
        dialogl = new Dialog(MainActivity.this);
        dialogl.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogl.setContentView(R.layout.dialogl);
        dialogl.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialogl.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        dialogl.show();


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else {

                binding.include2.textView.setText(result.getContents());

            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
