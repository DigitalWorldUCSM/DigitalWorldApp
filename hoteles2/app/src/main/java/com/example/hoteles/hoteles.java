package com.example.hoteles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class hoteles extends AppCompatActivity {
    private Button Mapas;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
        Mapas =(Button) findViewById(R.id.maps);
        Mapas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });
        MediaController mediaController = new MediaController(this);
        videoView = findViewById(R.id.vid);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/basedatosha.appspot.com/o/videos%2Fvideoplayback.mp4?alt=media&token=0053025f-15fb-4329-9a9d-a004f79e1958");
        videoView.setVideoURI(uri);
        videoView.start();
    }
}