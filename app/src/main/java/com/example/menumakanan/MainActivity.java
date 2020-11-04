package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] s1,s2,s3;
    int[] image ={R.drawable.gulai,R.drawable.igabakar,R.drawable.nasgor,R.drawable.rendang,R.drawable.sate,R.drawable.soto,R.drawable.steak};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.menu_makanan);
        s2=getResources().getStringArray(R.array.description);
        s3=getResources().getStringArray(R.array.harga);

        Adapter myadapter = new Adapter(this,s1,s2,s3,image);
        recyclerView.setAdapter(myadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}