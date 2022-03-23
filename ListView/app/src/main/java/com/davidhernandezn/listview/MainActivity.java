package com.davidhernandezn.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Agregar elementos con los que se trabagara
private ListView listv;
private TextView tv_info;

//crear vector o array
    private String nombres [] = {"Juan","Victoria","lucia","Rosa","paula","Yesica", "carla"};//muestra elementos *lista
    private String edades [] = {"53","5","48","19","20","12", "43"};//mostrará los elementos del nombre que selecciones
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacionar la parte grafica con la logica
        listv = (ListView) findViewById(R.id.lv_1);
        tv_info = (TextView) findViewById(R.id.tv_2);

        //Crear vector adapter
        //ArrayAdapter <TipoValorUtilizar> adapter = nuevoObjetoArrayAdapter<tipoUtilizado> (contex en que Activity quiero que este, R.SIMPLE, VECTONOMBREARRAY);
        //COMUNICAR con la interfaz spinner
        //ArrayAdapter <String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String> (this,R.layout.list_item_usuarios, nombres);
        listv.setAdapter(adapter);//añadir el vector guardado en adapter al elemento list1

        //Metodo para hacer que cada elemento de la lista tenga una acción
        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //int i = posición del usuario
                //saber que dato selecciono el usuario =getItemAtPosition
                tv_info.setText("La edad de " +listv.getItemAtPosition(i)+" es de: "+ edades[i]+ "años");
            }
        });
    }
}