package com.nutricioapp.debkanya.tempus;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar extends AppCompatActivity {

    private static final String TAG = "Calendar";

    private CalendarView mCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);


        mCalendarView  = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
        {
            public void onSelectedDayChange(CalendarView calendarView, int year , int month, int day)
            {
                String date = (month + 1) + "/"  + day + "/" + year;
                Log.d("calendar:",date);
                addCalendarEvent();

            }
        });
    }
    public void addCalendarEvent(){

        Intent calIntent = new Intent(Intent.ACTION_INSERT);
        calIntent.setType("vnd.android.cursor.item/event");
        calIntent.putExtra(CalendarContract.Events.TITLE, "Add title here");
        calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Add location");
        calIntent.putExtra(CalendarContract.Events.DESCRIPTION, "Description");

        GregorianCalendar calDate = new GregorianCalendar(2012, 7, 15);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                calDate.getTimeInMillis());
        calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                calDate.getTimeInMillis());

        startActivity(calIntent);
    }
}
