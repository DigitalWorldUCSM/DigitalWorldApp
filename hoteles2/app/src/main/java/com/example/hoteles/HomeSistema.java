package com.example.hoteles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeSistema extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        com.example.hoteles.MyHotelesData[] myHotelesData = new com.example.hoteles.MyHotelesData[]{
                new com.example.hoteles.MyHotelesData("Hotel Costa del Sol","Bolivar S/N, A.S.A",R.drawable.libertador),
                new com.example.hoteles.MyHotelesData("Hotel El Cabildo","Calle Manuel Ugarteche 411",R.drawable.cabildo),
                new com.example.hoteles.MyHotelesData("Conde De Lemos","Calle Bolivar 201,",R.drawable.conde),
                new com.example.hoteles.MyHotelesData("Selina Arequipa"," Calle Jerusalén 606",R.drawable.selina),
                new com.example.hoteles.MyHotelesData("Le Foyer","Ugarte 114",R.drawable.foyer),
                new com.example.hoteles.MyHotelesData("Santa Catalina","Santa Catalina 500",R.drawable.santa),
                new com.example.hoteles.MyHotelesData("Hostal Nuñez","Calle Jerusalén 528",R.drawable.hostalnu),

        };
        com.example.hoteles.MyHotelesAdapter myHotelesAdapter = new com.example.hoteles.MyHotelesAdapter(myHotelesData,HomeSistema.this);
        recyclerView.setAdapter(myHotelesAdapter);


    }
}