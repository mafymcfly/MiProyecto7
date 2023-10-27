package com.example.miproyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import  android.widget.Spinner;

import java.util.List;

public class formulario extends AppCompatActivity {




    //declaro variables

    Spinner spSpinner;
    //datos de Spinner contenido de un arreglo


    String[] comunas = new String[]{"Puente alto", "Macul", "San miguel", "Lampa", "La Florida"};

    EditText edtRut, edtNom, edtDir;

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        // uno las variables con los id del xml

        edtRut = (EditText) findViewById(R.id.edtRut);
        edtNom = (EditText) findViewById(R.id.edtNom);
        edtDir = (EditText) findViewById(R.id.edtDir);
        spSpinner = (Spinner) findViewById(R.id.spSpinner);
        lista = (ListView) findViewById(R.id.lstLista);


        // poblar el spinner para inser los datos del arreglo en el spinner

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, comunas);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSpinner.setAdapter(spinnerAdapter);
    }








        public void onClickAcceder(View view) {
            Intent intent = new Intent(this, Acceder.class);
            startActivity(intent);
        }

    }


