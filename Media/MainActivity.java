package com.example.hamas2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private SeekBar frecuencia;
    private Button inicio;
    private TextView freqVista;
    private AudioTrack audio;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Coneptar los widgets
        frecuencia = findViewById(R.id.seekBar);
        inicio = findViewById(R.id.button3);
        freqVista = findViewById(R.id.textView5);

        // Ajustar propieades de la SeekBar
        frecuencia.setMax(19800);       // 19.8 kHz
        frecuencia.setProgress(20);     // pasos de 20 Hz

        frecuencia.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        int freq = i + 20;
                        freqVista.setText("Frecuencia: " + freq + " Hz");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // Nothing to view here
                   }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        // Nothing to view here
                    }
                }
        );

        inicio.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Para activar la generación de audio
                        if(!isPlaying) {
                            int freq = frecuencia.getProgress() + 20;
                            inicio.setText("||");
                        }
                        // Para desactivar
                        else {
                            inicio.setText(">");
                        }
                        isPlaying = !isPlaying;
                    }
                }
        );
    }
}




