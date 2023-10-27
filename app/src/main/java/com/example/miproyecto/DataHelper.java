package com.example.miproyecto;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.jetbrains.annotations.Nullable;

public class DataHelper extends SQLiteOpenHelper {
    public DataHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE alumno (rut INTEGER PRIMARY KEY, nom TEXT, dir TEXT, com TEXT, nota INTEGER)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS alumno");

        // Crea la nueva estructura de la tabla
        db.execSQL("CREATE TABLE alumno (rut INTEGER PRIMARY KEY, nom TEXT, dir TEXT, com TEXT, nota INTEGER)");
    }

}

