package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class adivinha extends AppCompatActivity {

    Button botaosim;
    Button botaonao;
    Button botaovoltargps;

    ImageView vcpronto;
    ImageView vcmuitopoggers;
    ImageView saidaqui;
    ImageView voceestaaqui;
    WebView gps;

    int controledefala = 1;

    double latitude;
    double longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adivinha);

        botaovoltargps = (Button) findViewById(R.id.idbotaovvoltar);
        botaovoltargps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltamain();
            }
        });

        botaonao = (Button) findViewById(R.id.idbotaonao);
        botaonao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nao();
            }
        });

        botaosim = (Button) findViewById(R.id.idbotaosim);
        botaosim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sim();
            }
        });

        seapresenta();

    }

    void voltamain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void nao(){
        if (controledefala ==1){
        saidaqui();
        controledefala =5;
        }else
        if (controledefala ==2){
            saidaqui();
            controledefala =5;
        }else
        if (controledefala ==5){
          voltamain();
        }
    }
    void sim(){
        if (controledefala ==1){
            tutaaqui();
            localizacao();
            controledefala =2;
        }else
        if (controledefala ==2){
            muitobao();
            controledefala =5;
        }else
        if (controledefala ==5){
            voltamain();
        }
    }

    void seapresenta(){
        vcpronto=(ImageView)findViewById(R.id.ideusouvcpronto);
        vcpronto.setVisibility(View.VISIBLE);

        vcmuitopoggers=(ImageView)findViewById(R.id.idmuitobomtupoggers);
        vcmuitopoggers.setVisibility(View.GONE);

        saidaqui=(ImageView)findViewById(R.id.idsai);
        saidaqui.setVisibility(View.GONE);

        voceestaaqui=(ImageView)findViewById(R.id.idvoceaqui);
        voceestaaqui.setVisibility(View.GONE);

        gps=(WebView)findViewById(R.id.idgpsbrabo);
        gps.setVisibility(View.GONE);
    }
    void saidaqui(){
        vcpronto=(ImageView)findViewById(R.id.ideusouvcpronto);
        vcpronto.setVisibility(View.GONE);

        vcmuitopoggers=(ImageView)findViewById(R.id.idmuitobomtupoggers);
        vcmuitopoggers.setVisibility(View.GONE);

        saidaqui=(ImageView)findViewById(R.id.idsai);
        saidaqui.setVisibility(View.VISIBLE);

        voceestaaqui=(ImageView)findViewById(R.id.idvoceaqui);
        voceestaaqui.setVisibility(View.GONE);

        gps=(WebView)findViewById(R.id.idgpsbrabo);
        gps.setVisibility(View.GONE);
    }
    void tutaaqui(){
        vcpronto=(ImageView)findViewById(R.id.ideusouvcpronto);
        vcpronto.setVisibility(View.GONE);

        vcmuitopoggers=(ImageView)findViewById(R.id.idmuitobomtupoggers);
        vcmuitopoggers.setVisibility(View.GONE);

        saidaqui=(ImageView)findViewById(R.id.idsai);
        saidaqui.setVisibility(View.GONE);

        voceestaaqui=(ImageView)findViewById(R.id.idvoceaqui);
        voceestaaqui.setVisibility(View.VISIBLE);

        gps=(WebView)findViewById(R.id.idgpsbrabo);
        gps.setVisibility(View.VISIBLE);
    }
    void muitobao(){
        vcpronto=(ImageView)findViewById(R.id.ideusouvcpronto);
        vcpronto.setVisibility(View.GONE);

        vcmuitopoggers=(ImageView)findViewById(R.id.idmuitobomtupoggers);
        vcmuitopoggers.setVisibility(View.VISIBLE);

        saidaqui=(ImageView)findViewById(R.id.idsai);
        saidaqui.setVisibility(View.GONE);

        voceestaaqui=(ImageView)findViewById(R.id.idvoceaqui);
        voceestaaqui.setVisibility(View.GONE);

        gps=(WebView)findViewById(R.id.idgpsbrabo);
        gps.setVisibility(View.GONE);
    }

    void localizacao(){

        WebView gps = findViewById(R.id.idgpsbrabo);
        gps.getSettings().setJavaScriptEnabled(true);
        gps.loadUrl("https://www.google.com/maps/search/?api=1&query=" + latitude + "," + longitude);
    }
}