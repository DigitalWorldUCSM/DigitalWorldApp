package com.example.hoteles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LimaHoteles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima_hoteles);
    }

    public void onClickSelina(View view) {
        startActivity(new Intent("com.example.hoteles"));}

    public void onClickbelmond(View view) {
        startActivity(new Intent("com.example.hoteles"));
    }
    public void onClickMariel(View view) {
        startActivity(new Intent("com.example.hoteles"));
    }
}