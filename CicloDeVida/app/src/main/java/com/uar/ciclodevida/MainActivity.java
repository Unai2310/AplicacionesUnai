package com.uar.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static String Tag = "Tag";
    private int contador = 0;
    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i(Tag, "onStart ");
        contador++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(Tag, "onStop ");
        contador--;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(Tag, "onDestroy ");
        contador++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i(Tag, "onPause ");
        contador++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i(Tag, "onResume ");
        contador++;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(Tag, "onRestart ");
        contador++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador++;
    }
}