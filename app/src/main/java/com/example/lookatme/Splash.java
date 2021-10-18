package com.example.lookatme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread= new Thread() {
            public void run() {
                try {
                    sleep(6000);



                } catch (Exception e) {
                    e.printStackTrace();


                } finally {
                    Intent intent=new Intent( Splash.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }


        };thread.start();
    }

}
  