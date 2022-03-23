package com.davidhernandezn.validarcamposvacios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Elementos que vamos a utilizar
    private EditText nombre;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identificamos los elementos graficos a utilizar
        nombre = (EditText) findViewById(R.id.et_nombre);
        password = (EditText) findViewById(R.id.et_password);
    }

//Crear metodo validar
    public void validar(View view){
   //recuperar valores de los campos (obtenerlos como string)
        String name = nombre.getText().toString();
        String pass = password.getText().toString();
        //  usar length para saber el tamaña de caracteres utilizados y validar si son igual a 0
        if (name.length() == 0){
            Toast.makeText(this, "Ingresa tu nombre", Toast.LENGTH_SHORT).show();
        }
        if (pass.length() == 0){
            Toast.makeText(this,"Ingresa tu password",Toast.LENGTH_SHORT).show();
        }if (nombre.length() != 0 && pass.length() != 0) { //si son diferente de 0 usando operador logico && igual
            Toast.makeText(this, "Ingresando...", Toast.LENGTH_SHORT).show();
        }
    }
}