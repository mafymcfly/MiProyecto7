package com.example.miproyecto;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Acceder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);
    }
    public void onClickNuevoActivity(View view){
        Intent intent = new Intent(this,  NuevoActivity.class);
        startActivity(intent);
    }

    public void onClickElementos(View view){
        Intent intent = new Intent(this,  Elementos.class);
        startActivity(intent);
    }








}

