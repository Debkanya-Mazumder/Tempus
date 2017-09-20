package com.nutricioapp.debkanya.tempus;

import android.provider.BaseColumns;

/**
 * Created by Debkanya Mazumder <dmazum2@uic.edu>on 20-09-2017.
 */

public class TaskContract {


    public static String DBNAME = "com.nutricioapp.debkanya.tempus.db";
    public static int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
        public static final String COL_TASK_START_TIME = "start time";

    }
}
