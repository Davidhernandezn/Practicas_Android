package com.davidhernandezn.calcularpromedios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1- indicar componentes a usar
    private EditText etxtingles;
    private EditText etxtpoo;
    private EditText etxtcontabilidad;
    private EditText etxtsoftware;
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2- identificar desde aqui a nuestros componentes graficos onCreate
        etxtingles = (EditText) findViewById(R.id.etxt_ingles);
        etxtpoo = (EditText) findViewById(R.id.etxt_poo);
        etxtcontabilidad = (EditText) findViewById(R.id.etxt_contablidad);
        etxtsoftware = (EditText) findViewById(R.id.etxt_software);
        tvresultado = (TextView) findViewById(R.id.tv_resultado);
    }
//Metodo para calcular promedio
    public void Evaluar(View view){
    //3- Tomar valores que ingresa el usuario y para pasarlos a string
        String materia1 = etxtingles.getText().toString();
        String materia2 = etxtpoo.getText().toString();
        String materia3 = etxtcontabilidad.getText().toString();
        String materia4 = etxtsoftware.getText().toString();

    //4- Convertir a tipo de valor a utilizar (INT parcear)
        int matter_1 = Integer.parseInt(materia1);
        int matter_2 = Integer.parseInt(materia2);
        int matter_3 = Integer.parseInt(materia3);
        int matter_4 = Integer.parseInt(materia4);

    //Operaciones de Evaluación (prioridad de signos)
        int promedio = (matter_1 + matter_2 + matter_3 + matter_4) / 4;
              if (promedio >= 7 ){
                  //String resultadoPromedio = String.valueOf(promedio);    //Regresar el resultado a tipo string
              tvresultado.setText("Aprovaste: " +promedio);
        }else if (promedio <= 6){
                  //String resultadoPromedio = String.valueOf(promedio);    //Regresar el resultado a tipo string
              tvresultado.setText("Estas reprobado: " +promedio);
        }

    }
}