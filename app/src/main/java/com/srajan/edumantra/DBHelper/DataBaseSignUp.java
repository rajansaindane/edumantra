package com.srajan.edumantra.DBHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.srajan.edumantra.Domain.GetSignUpInfo;

/**
 * Created by rajan on 6/4/17.
 */

public class DataBaseSignUp extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="studinfo.db";
    private static final String TABLE_NAME="studentinfo";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_name="name";
    private static final String COLUMN_address="address";
    private static final String COLUMN_contact="contact";
    private static final String COLUMN_qualification="qualification";
    private static final String COLUMN_email="email";
    private static final String COLUMN_username="username";
    private static final String COLUMN_password="password";
    private static final String COLUMN_cpassword="cpassword";
    SQLiteDatabase sqLiteDatabase;
//    private static final String TABLE_CREATE=("CREATE TABLE IF NOT EXISTS,"+ DATABASE_NAME + " ("+COLUMN_ID +"TEXT PRIMARY KEY," + COLUMN_name + "TEXT NOT NULL,"
//            + COLUMN_address + "TEXT NOT NULL,"+ COLUMN_contact + "TEXT NOT NULL,"
//            + COLUMN_qualification + "TEXT NOT NULL," +COLUMN_email + "TEXT NOT NULL,"
//            + COLUMN_username + "TEXT NOT NULL," + COLUMN_password + "TEXT NOT NULL,"
//            + COLUMN_cpassword + "TEXT NOT NULL);");



//    db.execSQL("CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + " ( " +
//    KEY_ID + " TEXT PRIMARY KEY , " +
//    KEY_NAME + " TEXT NOT NULL , " +
//    KEY_ROLLNO + " TEXT NOT NULL );"
//            );

    public DataBaseSignUp(Context context)

    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE studentinfo (\n" +
                "\t ID \tINTEGER NOT NULL,\n" +
                "\t name \tTEXT NOT NULL,\n" +
                "\t username \tTEXT NOT NULL,\n" +
                "\t password \tTEXT NOT NULL,\n" +
                "\t email \tTEXT NOT NULL,\n" +
                "\tPRIMARY KEY(`ID`)\n" +
                ");");

//        "CREATE TABLE "+ TABLE_NAME + " (" + COLUMN_ID +" TEXT PRIMARY KEY , " + COLUMN_name + " TEXT NOT NULL ,"
//                + COLUMN_address + " TEXT NOT NULL , " + COLUMN_contact + " TEXT NOT NULL , "
//                + COLUMN_qualification + " TEXT NOT NULL , " +COLUMN_email + " TEXT NOT NULL , "
//                + COLUMN_username + " TEXT NOT NULL , " + COLUMN_password + " TEXT NOT NULL , "
//                + COLUMN_cpassword + " TEXT NOT NULL)"
        this.sqLiteDatabase=sqLiteDatabase;
        Log.i("@sr","error"+sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        String query="DROP TABLE IF EXISTS"+TABLE_NAME;
        sqLiteDatabase.execSQL(query);
        this.onCreate(sqLiteDatabase);
    }

    public boolean insertStudinfo(GetSignUpInfo c)
    {
        sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();

        String query="select * from studentinfo";
        Cursor cursor=sqLiteDatabase.rawQuery(query,null);
        int count=cursor.getCount();

        values.put(COLUMN_ID,count);
        values.put(COLUMN_name,c.getName());
        values.put(COLUMN_address,c.getAdd());
        values.put(COLUMN_contact,c.getContact());
        values.put(COLUMN_qualification,c.getQualification());
        values.put(COLUMN_email,c.getEmail());
        values.put(COLUMN_username,c.getUsername());
        values.put(COLUMN_password,c.getPassword());
        values.put(COLUMN_cpassword,c.getCpassword());

       long result= sqLiteDatabase.insert(TABLE_NAME,null,values);

        if (result==-1)
        {
            return false;
        }
        else
            return true;
//        sqLiteDatabase.close();

    }

    public String searchpass(String password)
    {
        sqLiteDatabase=this.getReadableDatabase();
        String query="select * from "+TABLE_NAME;
        Cursor cursor=sqLiteDatabase.rawQuery(query,null);
        String a,b;
        b="not found";
        if (cursor.moveToFirst())
        {
            do
            {

                a=cursor.getString(7);
                if(a.equals(password))
                {
                    b=cursor.getString(7);
                    break;
                }

            }while (cursor.moveToNext());
        }
        return b;
    }
}
