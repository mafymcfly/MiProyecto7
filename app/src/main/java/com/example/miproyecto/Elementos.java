package com.example.miproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Elementos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementos);
    }



    public void onClickCard(View view){
        Intent intent = new Intent(this, Card.class);
        startActivity(intent);
    }


    }





