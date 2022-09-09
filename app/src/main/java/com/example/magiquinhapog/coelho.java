package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class coelho extends AppCompatActivity {

    ImageView cartolaabaixada;
    ImageView cartolafundo;
    ImageView coelho;

    Button mexecartola;
    Button voltarcoelho;

    int variaveldecontrole = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coelho);

        voltarcoelho = (Button) findViewById(R.id.idbotaovoltarcoelho);
        voltarcoelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltamain();
            }
        });

        mexecartola = (Button) findViewById(R.id.botaomexercartolaid);
        mexecartola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                embaralhamento();
            }
        });
    }
    void embaralhamento(){
        if(variaveldecontrole == 1){
            coelhovisivel();
            variaveldecontrole = 2;
        }else
        if(variaveldecontrole == 2){
            cartolavisivel();
            variaveldecontrole = 3;
        }else
        if(variaveldecontrole == 3){
            cartolafundovisivel();
            variaveldecontrole = 4;
        }else
        if(variaveldecontrole == 4){
            cartolavisivel();
            variaveldecontrole = 1;
        }

    }

    void voltamain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void coelhovisivel(){
        cartolaabaixada=(ImageView)findViewById(R.id.cartolaid);
        cartolaabaixada.setVisibility(View.GONE);

        cartolafundo=(ImageView)findViewById(R.id.fundocartolaid);
        cartolafundo.setVisibility(View.GONE);

        coelho=(ImageView)findViewById(R.id.coelhoid);
        coelho.setVisibility(View.VISIBLE);
    }
    void cartolavisivel(){
        cartolaabaixada=(ImageView)findViewById(R.id.cartolaid);
        cartolaabaixada.setVisibility(View.VISIBLE);

        cartolafundo=(ImageView)findViewById(R.id.fundocartolaid);
        cartolafundo.setVisibility(View.GONE);

        coelho=(ImageView)findViewById(R.id.coelhoid);
        coelho.setVisibility(View.GONE);
    }
    void cartolafundovisivel(){
        cartolaabaixada=(ImageView)findViewById(R.id.cartolaid);
        cartolaabaixada.setVisibility(View.GONE);

        cartolafundo=(ImageView)findViewById(R.id.fundocartolaid);
        cartolafundo.setVisibility(View.VISIBLE);

        coelho=(ImageView)findViewById(R.id.coelhoid);
        coelho.setVisibility(View.GONE);
    }




}