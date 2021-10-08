package com.jjua.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int valorContador = 0;
    private TextView contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = findViewById(R.id.contador);
        findViewById(R.id.incrementar).setOnClickListener(view -> {
            incrementar();
        });
        findViewById(R.id.decrementar).setOnClickListener(view -> {
            decrementar();
        });
        findViewById(R.id.resetear).setOnClickListener(view -> {
            resetear();
        });
    }

    private void incrementar() {
        contador.setText(Integer.toString(valorContador+1));
        valorContador++;
    }
    private void decrementar() {
        contador.setText(Integer.toString(valorContador-1));
        valorContador--;
    }
    private void resetear() {
        contador.setText(Integer.toString(0));
        valorContador = 0;
    }
}