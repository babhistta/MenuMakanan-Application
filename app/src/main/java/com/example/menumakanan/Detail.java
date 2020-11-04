package com.example.menumakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    ImageView mainImageView;
    TextView title,desc,harga;
    String data1,data2,data3;
    int myimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        mainImageView = findViewById(R.id.imgView);
        title = findViewById(R.id.txtTitle);
        desc = findViewById(R.id.txtDescription);
        harga = findViewById(R.id.txtHarga);

        getdata();
        setdata();

    }

    private void getdata(){
        if (getIntent().hasExtra("myimage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getStringExtra("data3");
            myimage = getIntent().getIntExtra("myimage",1);
        }else{
            Toast.makeText(this, "noDAta", Toast.LENGTH_SHORT).show();
        }
    }
    private void setdata(){
        title.setText(data1);
        desc.setText(data2);
        harga.setText(data3);
        mainImageView.setImageResource(myimage);
    }
}
