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
    private AudioTrack audioTrack;
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
                            // Obtener el valor de frecuencia
                            int freq = frecuencia.getProgress() + 20;
                            // Iniciar el audio generado
                            elPlai(freq);
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

    // MÉTODOS
    // Pa' generar el audio
    private void elPlai(int frecuencia)
    {
        int bufferSize = AudioTrack.getMinBufferSize(
                frecuencia,
                AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT
        );
        audioTrack = new AudioTrack.Builder()
                .setAudioFormat(new AudioFormat.Builder()
                        .setSampleRate(frecuencia)
                        .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                        .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                        .build())
                .setTransferMode(AudioTrack.MODE_STREAM)
                .setBufferSizeInBytes(bufferSize)
                .build();

        // Se ejecuta
        audioTrack.play();

        // Propiedades
        final int fs = 44100;
        final double freqangular = 2.0 * Math.PI * frecuencia;
        final short[] buffer = new short[fs];
        final double incremento = freqangular / fs;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(isPlaying)
                {
                    for(int i = 0; i < fs; i++)
                    {
                        buffer[i] = (short)(Short.MAX_VALUE * Math.sin(freqangular * i / fs));
                    }
                    audioTrack.write(buffer, 0, buffer.length);
                }
                stopAudio();
            }
        }).start();
    }

    private void stopAudio()
    {
        if (audioTrack != null) {
            audioTrack.stop();
            audioTrack.release();
        }
        isPlaying = false;
    }
}
