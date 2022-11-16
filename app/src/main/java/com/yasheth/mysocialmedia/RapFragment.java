package com.yasheth.mysocialmedia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

public class RapFragment extends Fragment {

    CheckBox check1;
    CheckBox check2;
    CheckBox check3;
    CheckBox check4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_rap, container, false);


        check1 = (CheckBox)rootView.findViewById(R.id.rap1);
        check2 = (CheckBox)rootView.findViewById(R.id.rap2);
        check3 = (CheckBox)rootView.findViewById(R.id.rap3);
        check4 = (CheckBox)rootView.findViewById(R.id.rap4);



        // Do something in response to button
        SharedPreferences myPreference = getContext().getSharedPreferences("MyRapPreference", 0);
        //prepare it for edit by creating and Edit object
        SharedPreferences.Editor prefEditor = myPreference.edit();

        //store a check values  in memory

        check1.setOnClickListener(new View.OnClickListener()  {

            public void onClick (View v) {
                if(check1.isChecked() ){
                    prefEditor.putString("check1", check1.getText().toString());
                    Log.d("value in preferences:",check1.getText().toString());
                }

            }
        });
        check2.setOnClickListener(new View.OnClickListener()  {

            public void onClick (View v) {
                if(check2.isChecked() ){
                    prefEditor.putString("check2", check2.getText().toString());
                    Log.d("value in preferences:",check2.getText().toString());
                }

            }
        });
        check3.setOnClickListener(new View.OnClickListener()  {

            public void onClick (View v) {
                if(check3.isChecked() ){
                    prefEditor.putString("check3", check3.getText().toString());
                    Log.d("value in preferences:",check3.getText().toString());
                }

            }
        });
        check4.setOnClickListener(new View.OnClickListener()  {

            public void onClick (View v) {
                if(check4.isChecked() ){
                    prefEditor.putString("check4", check4.getText().toString());
                    Log.d("value in preferences:",check4.getText().toString());
                }

            }
        });




     /*   //commit the transaction
        prefEditor.commit();*/







        Button button = (Button) rootView.findViewById(R.id.btnRap);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)  //check for what button is pressed
            {

                Log.d("STATE","Enter to check out rap's button");

                //commit the transaction
                prefEditor.commit();


                //call intent only to show the next activity
                //Intent intent = new Intent(this, CheckOutActivity.class);
                Intent myIntent = new Intent(getActivity(), CheckOutActivity.class);
                myIntent.putExtra("preferenceName","MyRapPreference");
                startActivity(myIntent);


            }
        });

        return rootView;
    }



}