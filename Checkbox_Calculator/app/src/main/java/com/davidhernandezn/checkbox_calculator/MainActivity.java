package com.davidhernandezn.checkbox_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//1- Elementos graicos que ocuparemos
    private EditText et_num1;
    private EditText et_num2;
    private CheckBox cb_sum;
    private CheckBox cb_rest;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2- identificar componentes
        et_num1 = (EditText) findViewById(R.id.et_numero1);
        et_num2 = (EditText) findViewById(R.id.et_numero2);
        cb_sum = (CheckBox) findViewById(R.id.cb_suma);
        cb_rest = (CheckBox) findViewById(R.id.cb_resta);
        tv_result = (TextView) findViewById(R.id.tv_valor);
    }
//METODO CALCULAR
    public void Calcular (View view){
        //3- Obtener valores
        String num1_string = et_num1.getText().toString();
        String num2_string = et_num2.getText().toString();
        //4- parcer a Int
        int num1_int = Integer.parseInt(num1_string);
        int num2_int = Integer.parseInt(num2_string);

        //Variable de acumulación para poder imprimir en la misma variable
        String resultado = "";

        if (cb_sum.isChecked() == true){
            int suma = num1_int + num2_int; //creo variable para la operación
            resultado = "La suma es: " +suma+" //";

        }if (cb_rest.isChecked() == true){
            int resta = num1_int - num2_int; //creo variable para la operación
            resultado = resultado+"La resta es: " +resta+" //"; //añadir variable con su valor anterior
        }//Si se a tocado el check 1 va tener valor y lo mostrara si no no pasa nada solo se envia resta
        tv_result.setText(resultado);
    }
}