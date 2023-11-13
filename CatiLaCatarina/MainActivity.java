package com.example.catilacatarina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // ATRIBUTOS
    EditText texto;
    Button boton;
    TextToSpeech habla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.editTextText);
        boton = findViewById(R.id.button);

        // Crear un objeto textToSpeech
        habla = new TextToSpeech(
                getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i != TextToSpeech.ERROR) {
                            // Seeleccionar el idioma para el habla
                            habla.setLanguage(Locale.ITALIAN);
                        }
                    }
                }
        );

        // Para el control del botón
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                habla.speak(
                        texto.getText().toString(),
                        TextToSpeech.QUEUE_FLUSH, null
                );
            }
        });

    }
}





