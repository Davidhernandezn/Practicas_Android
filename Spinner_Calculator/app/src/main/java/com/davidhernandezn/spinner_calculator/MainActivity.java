package com.davidhernandezn.spinner_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView resultado;
    private Spinner spiner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.et_number1);
        num2 = (EditText) findViewById(R.id.et_number2);
        resultado = (TextView) findViewById(R.id.tv_resultado);
        spiner1 = (Spinner) findViewById(R.id.spinner);

        //Crear Array para agregar datos al spinner
        //tipoDatos [] nombreArray = {"val", "val", ...};
        String operacionesMat [] = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        //clase <TipoValorUtilizar> adapter = nuevoObjeto<tipoUtilizado> (contex en que Activity quiero que este, R.SIMPLE, VECTONOMBREARRAY);
        //COMUNICAR con la interfaz spinner
        //ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operacionesMat);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_calculator, operacionesMat);
        spiner1.setAdapter(adapter); //agregarle la collection  spinerNombre.setAdapter(nomberObjeto);
    }
//METODO
    public void OperacionesMat(View view){
        String numero1_String = num1.getText().toString();
        String numero2_String = num2.getText().toString();

        int numero1_Int = Integer.parseInt(numero1_String);
        int numero2_Int = Integer.parseInt(numero2_String);

        //variable que identificara la opción que eliga el usuario
        String seleccion = spiner1.getSelectedItem().toString();

        if (seleccion.equals("Sumar")){
            int result = numero1_Int + numero2_Int; //operacion
            String resulta = String.valueOf(result);//convertir a string
            resultado.setText(resulta);

        }else if (seleccion.equals("Restar")){
            int result = numero1_Int - numero2_Int; //operacion
            String resulta = String.valueOf(result);//convertir a string
            resultado.setText(resulta);

        }else if (seleccion.equals("Multiplicar")){
            int result = numero1_Int * numero2_Int; //operacion
            String resulta = String.valueOf(result);//convertir a string
            resultado.setText(resulta);

        }else if (seleccion.equals("Dividir")){
            if (numero2_Int == 0){
                Toast.makeText(this, "Ingresa un numero diferente de 0", Toast.LENGTH_LONG).show();
            }else {
            int result = numero1_Int / numero2_Int; //operacion
            String resulta = String.valueOf(result);//convertir a string
            resultado.setText(resulta);
        }

    }
}}