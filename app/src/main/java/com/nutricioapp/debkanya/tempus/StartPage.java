package com.nutricioapp.debkanya.tempus;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        //initializing the four buttons: calendar, track, lists and quit.
        btncalender = (Button)findViewById(R.id.btn_startpg_calendar);
        btntrack = (Button)findViewById(R.id.btn_startpg_track);
        btnlists = (Button)findViewById(R.id.btn_startpg_lists);
        btnquit = (Button)findViewById(R.id.btn_startpg_quit);

        // Calander Functionality:
        btncalender.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent startCalendarButton = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(startCalendarButton);
            }
        });

        // Lists Functionality:
        btnlists.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent startListButton = new Intent(getApplicationContext(), Lists.class);
                startActivity(startListButton);
            }
        });

        // Track Functionality:
        btntrack.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent startTrackButton = new Intent(getApplicationContext(), TrackUser.class);
                startActivity(startTrackButton);
            }
        });

        // Exit Functionality:
        btnquit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent startQuitButton = new Intent(Intent.ACTION_MAIN);
                startQuitButton.addCategory(Intent.CATEGORY_HOME);
                startQuitButton.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(startQuitButton);
            }
                /* ------------------------ Back button on home page - to exit functionality yet to be implemented ----------------------

                public void onBackPressed()
                {
                    // On pressing the 'back' button to exit the app,,the alert dialog box pop's up:
                    AlertDialog.Builder builder = new AlertDialog.Builder(StartPage.this);
                    builder.setMessage("Do you intend to exit Tempus?");
                    builder.setCancelable(true);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                        }
                    });
                    builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
            });
        }
        */
        });
    }
}