package com.gajal.womenssafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//here handler class is used for splash screen and post delayed method is used to delayed the activity
// for some time and new runnable identify for how much our activity will run
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(MainActivity.this==null){
                    return;
                }
                Intent intent =new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}