package com.example.publicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mytoolbox.Extensions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Extensions.s(this,"Hello from MainActivityApp");
    }
}