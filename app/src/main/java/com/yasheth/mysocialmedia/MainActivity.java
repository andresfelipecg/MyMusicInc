package com.yasheth.mysocialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RockFragment rockFragment;
    PopFragment popFragment;
    JazzFragment jazzFragment;
    RapFragment rapFragment;
    ClassicalFragment classicalFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockFragment = new RockFragment();
        popFragment = new PopFragment();
        jazzFragment = new JazzFragment();
        rapFragment = new RapFragment();
        classicalFragment = new ClassicalFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, rockFragment).commit();
    }

    //
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.genre_menu, menu);
        return true;
    }

    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.rock:
                Toast.makeText(this, "You selected Rock!", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, rockFragment).commit();

                break;

            case R.id.pop:
                Toast.makeText(this, "You selected Pop!", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, popFragment).commit();

                break;

            case R.id.jazz:
                Toast.makeText(this, "You selected Play Jazz!", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, jazzFragment).commit();

                break;

            case R.id.rap:
                Toast.makeText(this, "You selected Rap!", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, rapFragment).commit();

                break;
            case R.id.classical:
                Toast.makeText(this, "You selected Classical!", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad, classicalFragment).commit();

                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }




    /*public void loadHomeFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,homeFragment).commit();
    }
    public void loadSearchFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,searchFragment).commit();
    }
    public void loadProfileFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,profileFragment).commit();
    }
    public void loadOptionFragment(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameToLoad,optionFragment).commit();
    }*/
}