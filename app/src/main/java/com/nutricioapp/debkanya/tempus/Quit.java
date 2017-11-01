package com.nutricioapp.debkanya.tempus;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;

public class Quit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    public void ClickToExit(View v)
    {
        // To exit the app:
        finish();
    }

    @Override
    public void onBackPressed()
    {
        // On pressing the exit button,the alert dialog box
        AlertDialog.Builder builder = new AlertDialog.Builder(Quit.this);
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
}
