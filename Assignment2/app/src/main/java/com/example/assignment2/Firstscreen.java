package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Firstscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstscreen);


       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {


               startActivity(new Intent(getApplicationContext(), Register.class));


           }
       },3500);

    }
}