package com.example.nirgiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // ATRIBUTOS
    // Para manejar un botón
    private Button boton;
    // Para el manejo de una etiqueta de texto
    private TextView vista;

    // MÉTODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * Para el control de un objeto widget, se puede
        * implementar un escucha (listener) que está dedicado
        * a revisar el comportamiento de un widget
        * En este caso, se trata del evento de click
        * sobre el botón
        * */
        // En primer lugar se enlaza al widget
        // mediante el método findViewById
        // Enlazar el botón
        boton = findViewById(R.id.button);
        // Enlazar el cuadro de texto
        vista = findViewById(R.id.textView2);
        // El método recibe como parámetro un objeto OnClickListener
        // (el cual vive en la clase View), lo que genera una subclase
        // anónima
        boton.setOnClickListener(new View.OnClickListener(){
            // onClick se sobrecarga de la clase padre
            @Override
            public void onClick(View view)
            {
                // Obtiene el valor del texto del textView
                // se obtiene un CharSequence por lo que hay que
                // convertir a String
                String cuenta = vista.getText().toString();
                // convertir a entero mediante parseInt
                Integer count = Integer.parseInt(cuenta);
                // Incrementar en uno el contador
                count++;
                // Colocar el texto en el textView
                vista.setText(count.toString());
            }
        });
    }
}