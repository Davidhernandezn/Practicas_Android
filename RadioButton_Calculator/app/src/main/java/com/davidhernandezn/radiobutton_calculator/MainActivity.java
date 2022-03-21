package com.davidhernandezn.radiobutton_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1- indicar componentes a usar acceso + tipo + nombre
    private EditText edt_1;
    private EditText edt_2;
    private TextView tv_resultado;
    private RadioButton rbtn_suma;
    private RadioButton rbtn_resta;
    private RadioButton rbtn_multiplica;
    private RadioButton rbtn_dividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//2- Identificar los componentes graficos nombre + casting + find + r.id.nombre
        edt_1 = (EditText) findViewById(R.id.et_number1);
        edt_2 = (EditText) findViewById(R.id.et_number2);
        tv_resultado = (TextView) findViewById(R.id.tv_valor);
        rbtn_suma = (RadioButton) findViewById(R.id.rbtn_suma);
        rbtn_resta = (RadioButton) findViewById(R.id.rbtn_resta);
        rbtn_multiplica = (RadioButton) findViewById(R.id.rbtn_multitplicar);
        rbtn_dividir = (RadioButton) findViewById(R.id.rbtn_dividir);
    }

//3- crear metodo
    public void Calcular (View view){
//4- Recuperar valores que se ingresan y convertirlo a string
        //tipo de valor + nombre = variable. .
        String number1_string = edt_1.getText().toString();
        String number2_string = edt_2.getText().toString();
//5- parcearlos a interos convertir a entero + nueva variable
        int number1_int = Integer.parseInt(number1_string);
        int number2_int = Integer.parseInt(number2_string);

//Evaluar que check esta activo
if (rbtn_suma.isChecked() == true){
    int sumar = number1_int + number2_int;//operación
    String resultado = String.valueOf(sumar); //convertir a string
    tv_resultado.setText(resultado);
}else if (rbtn_resta.isChecked() == true){
    int restar = number1_int - number2_int;//operación
    String resultado = String.valueOf(restar); //convertir a string
    tv_resultado.setText(resultado);
}else if (rbtn_multiplica.isChecked() == true){
    int multiplicar = number1_int * number2_int;//operación
    String resultado = String.valueOf(multiplicar); //convertir a string
    tv_resultado.setText(resultado);
}else if (rbtn_dividir.isChecked() == true && number2_int != 0){
    int dividir = number1_int / number2_int;//operación
    String resultado = String.valueOf(dividir); //convertir a string
    tv_resultado.setText(resultado);
}else if(rbtn_dividir.isChecked() == true && number2_int ==0){
    Toast.makeText(this,"Ingresa otro numero diferente de 0",Toast.LENGTH_LONG).show();
    }
    }
}