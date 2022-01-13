package com.udc.checkboxuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //instanciamos objetos de componente
private EditText et1, et2;
private CheckBox Check1, Check2;
private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // se relacionan los componentes a los objetos
        et1 = (EditText)findViewById(R.id.txt1);
        et2 = (EditText)findViewById(R.id.txt2);
        Check1 = (CheckBox)findViewById(R.id.checkBox1);
        Check2 = (CheckBox)findViewById(R.id.checkBox2);
        tv1 = (TextView)findViewById(R.id.tv_resultado);

    }

    public void Calcular(View view) {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

// creamos variable de resultado
        String Resultado = "";

        if (Check1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            Resultado = "La Suma es " + suma + " / ";

        }
        if (Check2.isChecked() == true) {
            int resta = valor1_int - valor2_int;
            Resultado = Resultado + "La Resta es: " + resta;
        }
        tv1.setText(Resultado);
    }
}