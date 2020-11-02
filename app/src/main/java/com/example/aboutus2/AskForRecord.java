package com.example.aboutus2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AskForRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_for_record);
    }

    public void BackHome(View view) {
        Intent a = new Intent (this,MainActivity.class);
        startActivity(a);
    }
}