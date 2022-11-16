package com.yasheth.mysocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }


    public void payment(View view) {
        Log.i("payment:","Payment completed!");

        Toast.makeText(this, "Payment completed!", Toast.LENGTH_LONG).show();

        Intent myIntent = new Intent(this, EnterActivity.class);
        //myIntent.putExtra("preferenceName","MyRockPreference");
        startActivity(myIntent);
    }
}