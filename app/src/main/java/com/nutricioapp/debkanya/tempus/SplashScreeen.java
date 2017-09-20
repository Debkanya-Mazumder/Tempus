package com.nutricioapp.debkanya.tempus;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreeen extends AppCompatActivity
{
    // Splash screen timer
    private static int SPLASHSCREEN_TIME_OUT = 4500;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screeen);

        // Introduce a handler to implement a thread to execute the splash screen
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreeen.this, StartPage.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASHSCREEN_TIME_OUT);
    }
}
