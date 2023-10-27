package com.example.miproyecto;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Card extends AppCompatActivity {


    //declaro variables

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageview);

        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();
    }

    public  class MyAsyncTask extends AsyncTask<Void,Void,String> {

        @Override
        protected  String doInBackground(Void... voids){
            // INICIO LA ACTIVIDAD EN SEGUNDO PLANO
            // LE INDICAMOS QUE DEBE ESPERAR 5 SEGUNDOS


            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            return "¡¡ gracias por tu compra !! ";
        }

        @Override
        protected  void onPostExecute(String result){
            // ACTUALIZAR LA INTERFAZ CON EL TEXTO
            textView.setText(result);
            //MUESTRA LA IMAGEN
            imageView.setVisibility(imageView.VISIBLE);
        }

    }

    public void onClickCard(View view){
        Intent intent = new Intent(this, Card.class);
        startActivity(intent);

    }




}
