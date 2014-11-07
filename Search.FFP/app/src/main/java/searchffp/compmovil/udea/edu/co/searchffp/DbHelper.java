package searchffp.compmovil.udea.edu.co.searchffp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    // NOMBRE DE LA BASE DE DATOS
    private static final String BD_NAME = "locales.sqlite";

    // LA VERSIÓN DEL ESQUEMA DE LA BASE DE DATOS
    //LA VERSION DE LAS TABLAS DE LA ESTRUCTURA DE LA BASE DE DATOS
    private static final int DB_SCHEMA_VERSION = 1;

    /* AL INSTANCIA LA CLASE DE LLAMA AL CONTRUCTOR
    * SE LLAMA LA SUPER CLASE SQLiteOpenHelper
    * PASANDOLE EL NAME, FACTOTY Y LA VERSION DEL ESQUEMA DE LA BD*/
    public DbHelper(Context context) {
        super(context, BD_NAME, null, DB_SCHEMA_VERSION);
    }
    // SE EJECUTA CUANDO SE CREA LA BASE DE DATOS
    // EN ESTE METODO LA BASE DE DATOS SE CREA MEDIANTE SENTINCIAS DE SQL
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(DataBaseManager.CREATE_TABLE);
    }

    // MODIFICAR UNA TABLA O UN ATRIBUTO, CONTROLANDO CON CONDICIONALES LA VERSION DE LA
    //BASE DE DATOS
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
