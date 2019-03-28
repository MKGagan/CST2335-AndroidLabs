package com.example.androidlabs;


import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.app.DownloadManager.COLUMN_ID;

public class ChatRoomTable extends SQLiteOpenHelper {
    //database table
    public static final String DATABASE_NAME="chatroomdb";
    public static final String TABLE_NAME = "ChatRoom";
    public static final String CHAT_ID = "_id";
    public static final String MESSAGE = "message";
    public static final String STATUS = "status";
    public static final int  DATABASE_VERSION=1;

    // Database creation SQL statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_CHAT
            + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_CATEGORY + " text not null, "
            + COLUMN_SUMMARY + " text not null,"
            + COLUMN_DESCRIPTION
            + " text not null"
            + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

        Log.w(ChatRoomTable.class.getName(), "Upgrading database from version "
                + oldVersion + " to " + newVersion+ ", which will destroy all old data");
        //database.execSQL("DROP Table If Exists" + "todo");
        onCreate(database);
    }
}
}
