package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class bola8 extends AppCompatActivity {

    Button voltar;
    ImageView sim;
    ImageView nao;
    ImageView poggers;
    ImageView naotudomenos;
    ImageView naotenhoideia;
    ImageView comcerteza;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola8);
        voltar = (Button) findViewById(R.id.idbotaovoltar8);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltamain();
            }
        });


        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensorShake = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        SensorEventListener sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if (sensorEvent != null) {
                    float x_accl = sensorEvent.values[0];
                    float y_accl = sensorEvent.values[1];
                    float z_accl = sensorEvent.values[2];

                    if (x_accl > 36 ||
                            x_accl < -36 ||
                            y_accl > 36 ||
                            y_accl < -36 ||
                            z_accl > 36 ||
                            z_accl < -36) {
                        rolador();
                    }

                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        sensorManager.registerListener(sensorEventListener, sensorShake, SensorManager.SENSOR_DELAY_NORMAL);
    }

    void voltamain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void rolador(){
        Random r = new Random();
        int dado = r. nextInt(7 - 1) + 1;

        if(dado == 1) {
            um();}else
        if(dado == 2){
            dois();}else
        if(dado == 3){
            tres();}else
        if(dado == 4){
            quatro();}else
        if(dado == 5){
            cinco();}else
        if(dado == 6){
            seis();}
    }

    void um(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.GONE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.GONE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.GONE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.GONE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.GONE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.VISIBLE);
    }
    void dois(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.GONE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.GONE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.GONE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.GONE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.VISIBLE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.GONE);
    }
    void tres(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.GONE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.GONE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.GONE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.VISIBLE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.GONE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.GONE);
    }
    void quatro(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.GONE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.GONE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.VISIBLE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.GONE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.GONE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.GONE);
    }
    void cinco(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.GONE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.VISIBLE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.GONE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.GONE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.GONE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.GONE);
    }
    void seis(){
        sim=(ImageView)findViewById(R.id.botaovoltarid);
        sim.setVisibility(View.VISIBLE);

        nao=(ImageView)findViewById(R.id.imagenao);
        nao.setVisibility(View.GONE);

        naotenhoideia=(ImageView)findViewById(R.id.imagenaotenhoideia);
        naotenhoideia.setVisibility(View.GONE);

        naotudomenos=(ImageView)findViewById(R.id.imagenaotudomenosisso);
        naotudomenos.setVisibility(View.GONE);

        comcerteza=(ImageView)findViewById(R.id.imagecomcerteza);
        comcerteza.setVisibility(View.GONE);

        poggers=(ImageView)findViewById(R.id.imagepoggers);
        poggers.setVisibility(View.GONE);
    }
}