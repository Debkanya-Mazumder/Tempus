package com.nutricioapp.debkanya.tempus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class Calendar extends AppCompatActivity {


    private static final String TAG = "CalendarActivity";

    private CalendarView mCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);


        mCalendarView  = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            public void onSelectedDayChange(CalendarView calendarView, int year , int month, int day)
            {
                String date = (month + 1) + "/"  + day + "/" + year;
                Log.d("calendar:",date);
            }
        });
    }
}
