package com.yasheth.mysocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }

    public void enter(View view) {
        Log.i("enter:","enter app!");

        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}