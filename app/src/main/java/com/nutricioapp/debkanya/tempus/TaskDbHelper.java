package com.nutricioapp.debkanya.tempus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Debkanya Mazumder (dmazum2@uic.edu) on 20-09-2017.
 */

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(Context context)
    {
        super(context, TaskContract.DBNAME, null, TaskContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE " + TaskContract.TaskEntry.TABLE + " ( " +
                TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL) + " +
                TaskContract.TaskEntry.COL_TASK_START_TIME+ " DATETIME DEFAULT CURRENT_TIMESTAMP);";

        db.execSQL(createTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }

}
