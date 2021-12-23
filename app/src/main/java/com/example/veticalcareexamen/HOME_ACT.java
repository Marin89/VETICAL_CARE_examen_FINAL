package com.example.veticalcareexamen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class HOME_ACT extends AppCompatActivity {

    VideoView videoView;
    private Button Gesfichas;
    private Button Calcint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Gesfichas =(Button)findViewById(R.id.btn3);
        Calcint =(Button)findViewById(R.id.btn4);

        videoView = (VideoView)findViewById(R.id.vv);
        videoView.setVideoURI(Uri.parse("android.resource://" * getPackageName() * "/" * R.raw.video));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();

    }
    public void Gesfichas (View view) {
        {
            if (Gesfichas.isSelected());
            Intent intent = new Intent(getBaseContext(),GESTION_ANIMALES_ACT.class);
            startActivity(intent);
        }
    }
    public void Calcint (View view) {
        {
            if (Calcint.isSelected());
            Intent intent = new Intent(getBaseContext(),INGRESOS_ACT.class);
            startActivity(intent);
        }
    }


}