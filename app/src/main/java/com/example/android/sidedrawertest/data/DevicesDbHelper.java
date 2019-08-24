package com.example.android.sidedrawertest.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.sidedrawertest.data.DevicesContract.DeviceEntry;

public class DevicesDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "devices.db";

    private static final int DATABASE_VERSION = 1;

    public DevicesDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_DEVICE_TABLE = "CREATE TABLE " + DeviceEntry.TABLE_NAME + "("
                + DeviceEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DeviceEntry.COLLUMN_DEVICE_NAME + "TEXT NOT NULL,"
                + DeviceEntry.COLLUMN_DEVICE_CONSUMPTION + "INTEGER NOT NULL,"
                + DeviceEntry.COLLUMN_DEVICE_TYPE + "INTEGER NOT NULL);";

        db.execSQL(SQL_CREATE_DEVICE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
