package app.tramita.tramitaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CasaJuridica extends AppCompatActivity {
    TextView datosCasaJ1, datosCasaJ2,datosCasaJ3;
    Button btndatosCasaJ1,btndatosCasaJ2,btndatosCasaJ3;

        Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_juridica);
        getSupportActionBar().setTitle("Casas Juridicas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        datosCasaJ1 = findViewById(R.id.datosCasaJ1);
        datosCasaJ2 = findViewById(R.id.datosCasaJ2);
        datosCasaJ3 = findViewById(R.id.datosCasaJ3);

        btndatosCasaJ1 = findViewById(R.id.btndatosCasaJ1);
        btndatosCasaJ2 = findViewById(R.id.btndatosCasaJ2);
        btndatosCasaJ3 = findViewById(R.id.btndatosCasaJ3);

        context = this;

        btndatosCasaJ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               new Prosesando_tramite(context);
            }
        });

        btndatosCasaJ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CasaJuridica.this, Prosesando_tramite.class);
                startActivity(intent);
            }
        });

        btndatosCasaJ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CasaJuridica.this, Prosesando_tramite.class);
                startActivity(intent);
            }
        });
    }

    @Override public  boolean onCreateOptionsMenu (Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_tramites,mimenu);
        return true;
    }




    public void onClick2(View v) {
        switch (v.getId()){
            case R.id.casaJuridica1:
                if(datosCasaJ1.getVisibility() == View.GONE){
                    datosCasaJ1.setVisibility(View.VISIBLE);
                    btndatosCasaJ1.setVisibility(View.VISIBLE);

                    datosCasaJ2.setVisibility(View.GONE);
                    datosCasaJ3.setVisibility(View.GONE);
                    btndatosCasaJ2.setVisibility(View.GONE);
                    btndatosCasaJ3.setVisibility(View.GONE);


                }else {
                    datosCasaJ1.setVisibility(View.GONE);
                    btndatosCasaJ1.setVisibility(View.GONE);

                }break;
            case R.id.casaJuridica2:
                if(datosCasaJ2.getVisibility() == View.GONE){
                    datosCasaJ2.setVisibility(View.VISIBLE);
                    btndatosCasaJ2.setVisibility(View.VISIBLE);

                    datosCasaJ1.setVisibility(View.GONE);
                    datosCasaJ3.setVisibility(View.GONE);
                    btndatosCasaJ1.setVisibility(View.GONE);
                    btndatosCasaJ3.setVisibility(View.GONE);


                }else {
                    datosCasaJ2.setVisibility(View.GONE);
                    btndatosCasaJ2.setVisibility(View.GONE);

                }break;
            case R.id.casaJuridica3:
                if(datosCasaJ3.getVisibility() == View.GONE){
                    datosCasaJ3.setVisibility(View.VISIBLE);
                    btndatosCasaJ3.setVisibility(View.VISIBLE);


                    datosCasaJ1.setVisibility(View.GONE);
                    datosCasaJ2.setVisibility(View.GONE);
                    btndatosCasaJ1.setVisibility(View.GONE);
                    btndatosCasaJ2.setVisibility(View.GONE);

                }else {
                    datosCasaJ3.setVisibility(View.GONE);
                    btndatosCasaJ3.setVisibility(View.GONE);

                }break;

        }
    }
}
