package com.example.hoteles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.support.v4.app.*;
import android.widget.Toast;


import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;


public class Inicio extends AppCompatActivity {
private StorageReference mStorageReference;

    ImageView ImageViewAqp,ImageViewLima,ImageViewPiura,ImageViewTrujillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mStorageReference=FirebaseStorage.getInstance().getReference().child("imagenes/arequipa.png");
        try {
            final File localFile=File.createTempFile("arequipa","png");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Inicio.this,"picture retrievec",Toast.LENGTH_SHORT).show();
                            Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.viewAqp)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull  Exception e) {
                    Toast.makeText(Inicio.this,"error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference=FirebaseStorage.getInstance().getReference().child("imagenes/lima.jpg");
        try {
            final File localFile=File.createTempFile("lima","jpg");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Inicio.this,"picture retrievec",Toast.LENGTH_SHORT).show();
                            Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.viewLima)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull  Exception e) {
                    Toast.makeText(Inicio.this,"error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference=FirebaseStorage.getInstance().getReference().child("imagenes/piura.jpg");
        try {
            final File localFile=File.createTempFile("piura","jpg");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Inicio.this,"picture retrievec",Toast.LENGTH_SHORT).show();
                            Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.viewPiura)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull  Exception e) {
                    Toast.makeText(Inicio.this,"error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        mStorageReference=FirebaseStorage.getInstance().getReference().child("imagenes/trujillo.jpg");
        try {
            final File localFile=File.createTempFile("trujillo","jpg");
            mStorageReference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(Inicio.this,"picture retrievec",Toast.LENGTH_SHORT).show();
                            Bitmap bitmap= BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.viewTrujillo)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull  Exception e) {
                    Toast.makeText(Inicio.this,"error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void onClickArequipa(View view) {
        startActivity(new Intent("com.example.HomeSistema"));
    }
    public void onClickLima(View view) {
        startActivity(new Intent("com.example.LimaHoteles"));
    }
}