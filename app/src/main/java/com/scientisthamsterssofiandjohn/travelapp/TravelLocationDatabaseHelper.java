package com.scientisthamsterssofiandjohn.travelapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TravelLocationDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "travelLocation";
    private static final int DB_VERSION = 1;

    public TravelLocationDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE TRAVEL (_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "TITEL TEXT," +
                "LOCATION TEXT," +
                "IMAGE_URL TEXT," +
                "STAR_RATING REAL);");
        insertInfoTravel(db,"France","Eiffel Tower","https://www.baiaholiday.com/images/w-1900/h-1200/zc-1/q-80/p?src=https%3A%2F%2Fwww.baiaholiday.com%2Fuploads%2Fimage%2F1544432636159.jpg",
                4.7f);
        insertInfoTravel(db,"Kiev","Maidan Nezalezhnosti", "https://cdnp.flypgs.com/files/Sehirler-long-tail/Kyiv/kyiv-bag_ms_zl_k-anit.jpg",
                5.0f);
        insertInfoTravel(db,"Troeshina","The place where metro does not go",
                "https://weekend.today/modules/pages/upload/images/semen-shurochin02.jpg",
                5.0f);
        insertInfoTravel(db,"Hawaii","Hawaii Beach",
                "https://haleakalaecotours.com/wp-content/uploads/2019/04/hawaii-dangerous-waves.jpg",
                5.0f);
    }

    private static void insertInfoTravel(SQLiteDatabase db,String titel,String location,
                                         String imageUrl,Float starRating) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("TITEL",titel);
        contentValues.put("LOCATION",location);
        contentValues.put("IMAGE_URL",imageUrl);
        contentValues.put("STAR_RATING",starRating);
        db.insert("TRAVEL",null,contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
