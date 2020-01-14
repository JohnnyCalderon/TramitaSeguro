package app.tramita.tramitaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tipos_de_tramites extends AppCompatActivity implements View.OnClickListener {
    TextView lisTramite1, lisTramite2,lisTramite3;
    Button btnTramiteEnviar1,btnTramiteEnviar2,btnTramiteEnviar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_de_tramites);


        getSupportActionBar().setTitle("Transito");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lisTramite1 = findViewById(R.id.lisTramite1);
        lisTramite2 = findViewById(R.id.lisTramite2);
        lisTramite3 = findViewById(R.id.lisTramite3);

        findViewById(R.id.btn_Tramite1).setOnClickListener(this);
        findViewById(R.id.btn_Tramite2).setOnClickListener(this);
        findViewById(R.id.btn_Tramite3).setOnClickListener(this);

        btnTramiteEnviar1 = findViewById(R.id.btnTramiteEnviar1);
        btnTramiteEnviar2 = findViewById(R.id.btnTramiteEnviar2);
        btnTramiteEnviar3 = findViewById(R.id.btnTramiteEnviar3);

        btnTramiteEnviar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTramiteEnviar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTramiteEnviar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_Tramite1:
                if(lisTramite1.getVisibility() == View.GONE){
                    lisTramite1.setVisibility(View.VISIBLE);
                    btnTramiteEnviar1.setVisibility(View.VISIBLE);

                    lisTramite2.setVisibility(View.GONE);
                    lisTramite3.setVisibility(View.GONE);
                    btnTramiteEnviar2.setVisibility(View.GONE);
                    btnTramiteEnviar3.setVisibility(View.GONE);


                }else {
                    lisTramite1.setVisibility(View.GONE);
                    btnTramiteEnviar1.setVisibility(View.GONE);

                }break;
            case R.id.btn_Tramite2:
                if(lisTramite2.getVisibility() == View.GONE){
                    lisTramite2.setVisibility(View.VISIBLE);
                    btnTramiteEnviar2.setVisibility(View.VISIBLE);

                    lisTramite1.setVisibility(View.GONE);
                    lisTramite3.setVisibility(View.GONE);
                    btnTramiteEnviar1.setVisibility(View.GONE);
                    btnTramiteEnviar3.setVisibility(View.GONE);


                }else {
                    lisTramite2.setVisibility(View.GONE);
                    btnTramiteEnviar2.setVisibility(View.GONE);

                }break;
            case R.id.btn_Tramite3:
                if(lisTramite3.getVisibility() == View.GONE){
                    lisTramite3.setVisibility(View.VISIBLE);
                    btnTramiteEnviar3.setVisibility(View.VISIBLE);


                    lisTramite1.setVisibility(View.GONE);
                    lisTramite2.setVisibility(View.GONE);
                    btnTramiteEnviar1.setVisibility(View.GONE);
                    btnTramiteEnviar2.setVisibility(View.GONE);

                }else {
                    lisTramite3.setVisibility(View.GONE);
                    btnTramiteEnviar3.setVisibility(View.GONE);

                }break;

        }
    }

}
