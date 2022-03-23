package com.davidhernandezn.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodos para cada button
    public void Java (View view){
        Toast.makeText(this, "Selecciono Java", Toast.LENGTH_LONG).show();
    }

    public void Kolin(View view){
        Toast.makeText(this, "Selecciono Kotlin", Toast.LENGTH_LONG).show();
    }

    //solo toca asigane a cada boton su respectivo metodo
}