package com.example.adyun.kosakata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next (View view){
        Intent i = new Intent(this, tabbed.class);
        startActivity(i);
    }

    public void menu(View view){
        Intent m = new Intent(this, MainActivity.class);
        startActivity(m);
    }
}
