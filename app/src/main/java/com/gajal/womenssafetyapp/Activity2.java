package com.gajal.womenssafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
ImageView i1;
ImageView i2;
ImageView i3;
ImageView i4;
ImageView i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        i1=findViewById(R.id.img2);
        i2=findViewById(R.id.imageView23);
        i3=findViewById(R.id.img4);
        i4=findViewById(R.id.imageView15);
        i5=findViewById(R.id.imageView16);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Activity2.this,Tips.class);
                startActivity(intent);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Activity2.this,call.class);
                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Activity2.this,Register.class);
                startActivity(intent);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (Activity2.this,laws.class);
                startActivity(intent);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity2.this,defence.class);
                startActivity(intent);
            }
        });

    }
}