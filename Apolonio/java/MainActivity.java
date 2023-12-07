package com.example.apolonio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

// En efecto, es programación =D

public class MainActivity extends AppCompatActivity {

    // Variable de estado
    boolean isSwitchOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Coneptar a los widgets
        Button boton = findViewById(R.id.button1);
        ImageView foco = findViewById(R.id.led);

        // Iniciar variable de estado
        isSwitchOn = false;

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(!isSwitchOn) {
                    boton.setText("Turn Me On");
                    boton.setTextColor(Color.parseColor("white"));
                    boton.setBackgroundColor(Color.parseColor("#36BD31"));
                    foco.setImageResource(R.mipmap.apagado);
                    isSwitchOn = true;
                }
                else {
                    boton.setText("Turn Me Off");
                    boton.setTextColor(Color.parseColor("white"));
                    boton.setBackgroundColor(Color.parseColor("red"));
                    foco.setImageResource(R.mipmap.encendido);
                    isSwitchOn = false;
                }
            }
        });

    }
}