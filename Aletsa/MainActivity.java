package com.example.lacura;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // ATRIBUTOS
    EditText etText;
    ImageView ivMic,ivCopy;
    Spinner spLangs;
    String lcode = "en-US";

    // Idiomas incluídos
    String[] languages = {"Inglés","Español","Francés",
            "Árabe","Alemán","Portugués","Catalán", "Italiano",
            "Neerlandés","Danés","Sueco", "Ruso", "Rumano"
    };

    // Códigos de idiomas ISO 639-1
    String[] lCodes = {"en-US","es-MX","fr-FR",
            "ar-SA","de-DE","pt-PT","ca-ES","it-IT",
            "nl-NL","da-DK","sv-SE","ru-RU", "ro-RO"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectar objetos con widgets en vistas
        etText = findViewById(R.id.etSpeech);
        ivMic = findViewById(R.id.ivSpeak);
        ivCopy = findViewById(R.id.ivCopy);
        spLangs = findViewById(R.id.spLang);

        // Set onSelectedItemListener para el combobox o spinner
        spLangs.setOnItemSelectedListener(this);

        // Colocar (o set) el adaptador para el spinner
        // Cargar la lista de idiomas disponibles
        ArrayAdapter adapter = new ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, languages);
        // Los elementos del spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Colocar el adaptador
        spLangs.setAdapter(adapter);

        // Cuando se le de clic al ícono del micrófono
        ivMic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un intent utilizando RecognizerIntent para convertir el habla en texto
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                // Se añade el idioma
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                // El código del idioma
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,lcode);
                // Colocar un texto de indicación
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Díctame");
                // activar el intent para obtener el resultado
                activityResultLauncher.launch(intent);
            }
        });

        // En caso de querer copiar lo que se dictó
        ivCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Copiar al portapapeles
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                clipboardManager.setPrimaryClip(ClipData.newPlainText("label",etText.getText().toString().trim()));
                Toast.makeText(MainActivity.this, "Copiado!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Resultado de la actividad para iniciar el intento
    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    // En caso de que el resultado no este vacío
                    if (result.getResultCode() == Activity.RESULT_OK && result.getData()!=null) {
                        // get data and append it to editText
                        // Obtener los datos y añadirlo al editText
                        ArrayList<String> d=result.getData().getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        etText.setText(etText.getText()+" "+d.get(0));
                    }
                }
            });

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        // Con esto se coloca el lcode que corresponde al idioma seleccionado
        lcode = lCodes[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // automatically generated method
        // for implementing onItemSelectedListener
    }

}