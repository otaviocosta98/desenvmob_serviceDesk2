package br.usjt.desenvmob.aula03.model;

import android.provider.BaseColumns;

/**
 * Created by arqdsis on 11/04/2018.
 */

public final class FilaDbContract {

    public FilaDbContract() {
    }

    public static abstract class FilaDbBanco implements BaseColumns {
        public static final String TABLE_NAME = "Fila";
        public static final String ID_FILA = "id_fila";
        public static final String NM_FILA = "nm_fila";
        public static final String NM_FIGURA = "nm_figura";
        public static String IMG_Figura = "img_figura";
    }
}
