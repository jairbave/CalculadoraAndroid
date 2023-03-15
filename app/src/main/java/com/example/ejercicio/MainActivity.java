package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText edittext1;
    EditText edittext2;
    TextView RespuestaSuma;
    TextView RespuestaMultiplicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = findViewById(R.id.Valor1);
        edittext2 = findViewById(R.id.Valor2);
        RespuestaSuma = findViewById(R.id.Respuesta_Suma);
        RespuestaMultiplicacion = findViewById(R.id.Respuesta_Multiplicacion);

    }

    public void calculo(View view){
        int operacionsuma = Integer.parseInt(edittext1.getText().toString()) + Integer.parseInt(edittext2.getText().toString());
        int operacionmulti = Integer.parseInt(edittext1.getText().toString()) * Integer.parseInt(edittext2.getText().toString());
        RespuestaSuma.setText(operacionsuma+"");
        RespuestaMultiplicacion.setText(operacionmulti+"");
    }

}
