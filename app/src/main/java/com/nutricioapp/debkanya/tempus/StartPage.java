package com.nutricioapp.debkanya.tempus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    Button btncalender, btnlists, btntrack, btnquit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //initializing the three buttons: calendar, track, lists.
        btncalender = (Button)findViewById(R.id.btn_startpg_calendar);
        btntrack = (Button)findViewById(R.id.btn_startpg_track);
        btnlists = (Button)findViewById(R.id.btn_startpg_lists);
        btnquit = (Button)findViewById(R.id.btn_startpg_quit);

        // Calander Functionality:
        btncalender.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startCalendarButton = new Intent(getApplicationContext(), Calendar.class);
                startActivity(startCalendarButton);
            }
        });

        // Lists Functionality:
        btnlists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startListButton = new Intent(getApplicationContext(), Lists.class);
                startActivity(startListButton);
            }
        });

        // Quit Functionality:
        btnquit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                Intent startQuitButton = new Intent(getApplicationContext(), Quit.class);
                startActivity(startQuitButton);
            }
        });
    }
};