package app.tramita.tramitaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Tramites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tramites);
        getSupportActionBar().setTitle("Tipo de Tramites" );

    }

    @Override public  boolean onCreateOptionsMenu (Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_tramites,mimenu);

        return true;
    }

    public void  clickTrancito (View v){
        Intent intent = new Intent(Tramites.this,Tipos_de_tramites.class);
        startActivity(intent);
    }


    public void tramit(View v){
        Intent inten = new Intent(Tramites.this,Tipos_de_tramites.class);
        startActivity(inten);
    }

    public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();
        if (id ==R.id.configuracion){
            return true;
        }
        if (id ==R.id.info){
            tramit(null);
            return true;
        }

        return super.onOptionsItemSelected(opcion_menu);

    }

}
