package com.nutricioapp.debkanya.tempus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


        btncalender.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startCalendar = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(startCalendar);
            }
        });
        btnlists.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startCalendar = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(startCalendar);
            }
        });


    }
}
