package com.yasheth.mysocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CheckOutActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        String checkString1="";
        String checkString2="";
        String checkString3="";
        String checkString4="";
        //price of records
        double totalPrice=0;

        //Add radio buttons dynamically
        RadioGroup mRgAllButtons = findViewById(R.id.radiogroup);



        //retrieve what preference archive to use
        Intent intent=getIntent();
        String preferenceName=intent.getStringExtra("preferenceName");

        //retrieving from shared preferences
        SharedPreferences myPref = getSharedPreferences(preferenceName, MODE_PRIVATE);

        //if != null get check values
        if(myPref.contains("check1")) {
            checkString1 = myPref.getString("check1", "");

            RadioButton rdbtn1 = new RadioButton(this);
            rdbtn1.setId(1);
            rdbtn1.setText(checkString1);
            rdbtn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            mRgAllButtons.addView(rdbtn1);

            //Price
            totalPrice+=Double.parseDouble(checkString1.substring(checkString1.indexOf('$') + 1));
        }
        //if != null get check values
        if(myPref.contains("check2")) {
            checkString2 = myPref.getString("check2", "");

            RadioButton rdbtn2 = new RadioButton(this);
            rdbtn2.setId(2);
            rdbtn2.setText(checkString2);
            rdbtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mRgAllButtons.addView(rdbtn2);

            //Price
            totalPrice+=Double.parseDouble(checkString2.substring(checkString2.indexOf('$') + 1));
        }
        //if != null get check values
        if(myPref.contains("check3")) {
            checkString3 = myPref.getString("check3", "");

            RadioButton rdbt3 = new RadioButton(this);
            rdbt3.setId(3);
            rdbt3.setText(checkString3);
            rdbt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mRgAllButtons.addView(rdbt3);

            //Price
            totalPrice+=Double.parseDouble(checkString3.substring(checkString3.indexOf('$') + 1));
        }
        //if != null get check values
        if(myPref.contains("check4")) {
            checkString4 = myPref.getString("check4", "");

            RadioButton rdbt4 = new RadioButton(this);
            rdbt4.setId(4);
            rdbt4.setText(checkString4);
            rdbt4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            mRgAllButtons.addView(rdbt4);

            //Price
            totalPrice+=Double.parseDouble(checkString4.substring(checkString4.indexOf('$') + 1));
        }


        //Set up price
        TextView price=findViewById(R.id.price);
         price.setText(  Double.toString(totalPrice));



//Clean preferences
        SharedPreferences myPreference = getSharedPreferences(preferenceName, 0);
        myPreference.edit().clear().commit();

        //result
       // TextView tView = (TextView)findViewById(R.id.tView);
        //tView.setText("Retrieved from shared preferences: "+ myString);
    }

    public void delete(View view) {
        Log.i("delete:", "Call delete method");

    }

    public void payment(View view) {
        Log.i("payment:","Call payment method");

        Intent myIntent = new Intent(this, PaymentMethodActivity.class);
        //myIntent.putExtra("preferenceName","MyRockPreference");
        startActivity(myIntent);
    }
}