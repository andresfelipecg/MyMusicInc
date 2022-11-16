package com.yasheth.mysocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PaymentMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
    }

    public void payment(View view) {
        Log.i("payment:","Call payment method");

        Intent myIntent = new Intent(this, PaymentActivity.class);
        //myIntent.putExtra("preferenceName","MyRockPreference");
        startActivity(myIntent);
    }
}