package searchffp.compmovil.udea.edu.co.searchffp;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        // INSTANCIA DE LA CLASE DbHelper PASANDOLE EL CONTEXTO
        // DEL CONSTRUCTOR
        DbHelper helper = new DbHelper(this);
        //SE HACE LA LLAMADA PARA CREAR LA BASE DE DATOS
        // SI LA BASE DE DATOS NO EXISTE getWritableDatabase CREA LA BD
        // SI YA EXISTE LA DEVUELVE EN MODO ESCRITURA
       // SQLiteDatabase db = helper.getWritableDatabase();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    public void lanzarAllPlaces(View view){
        Intent i = new Intent(this, AllPlaces.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
