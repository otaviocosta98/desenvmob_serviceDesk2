package br.usjt.desenvmob.aula03.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static  br.usjt.desenvmob.aula03.model.FilaDbContract.FilaDbBanco;
/**
 * Created by arqdsis on 11/04/2018.
 */

public class FilaDbHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_FILA =
            "CREATE TABLE " + FilaDbBanco.TABLE_NAME + "(" +
                FilaDbBanco._ID + " INTEGER PRIMARY KEY," +
                FilaDbBanco.ID_FILA + " INTEGER," +
                FilaDbBanco.NM_FILA + " TEXT," +
                FilaDbBanco.NM_FIGURA + " TEXT, " +
                FilaDbBanco.IMG_Figura + " BLOB)";

    public static final String SQL_DROP_FILA =
            "DROP TABLE IF EXISTS " + FilaDbBanco.TABLE_NAME;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Fila.db";

    public FilaDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_FILA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DROP_FILA);
        sqLiteDatabase.execSQL(SQL_CREATE_FILA);
    }
}
