package com.artesanoskuad.holaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Calculadora calculadora;
    private EditText etValores;
    private Button btnSumar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculadora = new Calculadora();
        etValores = findViewById(R.id.et_valores);
        btnSumar = findViewById(R.id.btn_sumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarValores();
            }
        });
    }

    private void sumarValores() {
        String valores = etValores.getText().toString();
        String resultado = calculadora.add(valores) + "";
        alert(resultado);
    }

    private void alert(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


}