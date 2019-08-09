package com.example.mediaplayer;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekVolume;
    private Button buttonPlay,buttonStop,buttonPause;
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.huntinghighandlow);
        inicializarSeekbar();

    }

    private void inicializarSeekbar(){

        seekVolume = findViewById(R.id.seekBarVolume);

        //Configura o audio Manager

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //Recuperando os valores maximo e minimo

        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        //Configura os Valores maximos para a seekbar

        seekVolume.setMax(volumeMaximo);

        //Configura o progresso atual do seekbar

        seekVolume.setProgress(volumeAtual);

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,i,
                        AudioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void executaSom(View view){
        if(mediaPlayer!=null){
            mediaPlayer.start();
        }
    }

    public void pararSom(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void terminarSom(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(this,R.raw.huntinghighandlow);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null && mediaPlayer.isPlaying()){
          mediaPlayer.stop();
          mediaPlayer.release();
          mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

}
