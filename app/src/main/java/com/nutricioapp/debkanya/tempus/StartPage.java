package com.nutricioapp.debkanya.tempus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    Button btncalender, btnlists, btntrack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //initializing the three buttons: calendar, track, lists.
        btncalender = (Button)findViewById(R.id.btn_startpg_calendar);
        btntrack = (Button)findViewById(R.id.btn_startpg_track);
        btnlists = (Button)findViewById(R.id.btn_startpg_lists);
    }
}
