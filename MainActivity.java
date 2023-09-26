package com.example.nirgiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    // ATRIBUTOS
    // Para manejar un botón
    private Button boton;
    // Para el manejo de una etiqueta de texto
    private TextView vista;
    private EditText editText1;
    private EditText editText2;
    private TextView resultado;
    private Button boton2;

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
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        resultado = findViewById(R.id.textView3);
        boton2 = findViewById(R.id.button2);

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

        boton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                realizarOperacion("/");
            }
        });


    }
    // Método privado, que se usa exclusivamente dentro de la clase
    private void realizarOperacion(String operador)
    {
        // Variables locales
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double resul = 666;

        try {
            switch(operador)
            {
                case "/":
                    if(num2 != 0)
                    {
                        resul = num1 / num2;
                    }
                    else
                    {
                        Toast.makeText(this, "División mortal infinita", Toast.LENGTH_SHORT).show();
                    }
                    break;
            }
            //String manda = String.format("%0.2f", resul);
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);
            String rd = nf.format(resul);
            resultado.setText( rd );
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, "Ingrese números válidos", Toast.LENGTH_SHORT).show();
        }
    }
}
