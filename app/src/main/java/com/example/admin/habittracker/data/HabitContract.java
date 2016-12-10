package com.example.admin.habittracker.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Habit Tracker app.
 */

public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {
    }

    /**
     * Inner class that defines constant values for the habit tracker database table.
     */
    public static final class HabitEntry implements BaseColumns {


        /**
         * Name of database table for habit tracker
         */
        public final static String TABLE_NAME = "habits";


        /**
         * Unique ID number for the habit (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habit.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME = "name";

        /**
         * Frequency of the habit per week.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_FREQUENCY = "frequency";

        /**
         * Status of the habit
         *
         * The only possible values are {@link #HABIT_STATUS_UNKNOWN}, {@link #HABIT_STATUS_DONE},
         * or {@link #HABIT_STATUS_NOT_DONE}.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_STATUS = "status";


        /**
         * Possible values for the status of the habit
         */
        public static final int HABIT_STATUS_UNKNOWN = 0;
        public static final int HABIT_STATUS_DONE = 1;
        public static final int HABIT_STATUS_NOT_DONE = 2;
    }
}