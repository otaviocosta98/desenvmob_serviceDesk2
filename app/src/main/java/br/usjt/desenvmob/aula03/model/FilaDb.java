package br.usjt.desenvmob.aula03.model;

import static br.usjt.desenvmob.aula03.model.FilaDbContract.FilaDbBanco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by arqdsis on 11/04/2018.
 */

public class FilaDb {

    private FilaDbHelper dbHelper;

    public FilaDb(Context context) {
        dbHelper = new FilaDbHelper(context);
    }

    public void inserirFila(ArrayList<Fila> filas){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        for (Fila fila: filas) {
            values.put(FilaDbBanco.ID_FILA, fila.getId());
            values.put(FilaDbBanco.NM_FILA, fila.getNome());
            values.put(FilaDbBanco.NM_FIGURA, fila.getFigura());
            db.insert(FilaDbBanco.TABLE_NAME, null, values);
        }
        db.close();
    }

    public ArrayList<Fila> listarFilas(){
        ArrayList<Fila> filas = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] colunas = {FilaDbBanco.ID_FILA, FilaDbBanco.NM_FILA, FilaDbBanco.NM_FIGURA};

        String orderBy = FilaDbBanco.ID_FILA;

        Cursor c;
        c = db.query(FilaDbBanco.TABLE_NAME, colunas, null, null ,null, null, orderBy);
        while(c.moveToNext()){
            Fila fila = new Fila();
            fila.setId(c.getInt(c.getColumnIndex(FilaDbBanco.ID_FILA)));
            fila.setNome(c.getString(c.getColumnIndex(FilaDbBanco.NM_FIGURA)));
            fila.setFigura(c.getString(c.getColumnIndex(FilaDbBanco.NM_FIGURA)));
            filas.add(fila);
        }
        c.close();
        db.close();
        return filas;
    }


}
