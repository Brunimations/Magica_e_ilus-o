package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class taro extends AppCompatActivity {
    ImageView costas;

    ImageView louco;
    ImageView mago;
    ImageView altasacerdotisa;
    ImageView imperatriz;
    ImageView imperador;
    ImageView hierofante;
    ImageView enamorados;
    ImageView carro;
    ImageView forca;
    ImageView eremita;
    ImageView rodadafortuna;
    ImageView justica;
    ImageView pendurado;
    ImageView morte;
    ImageView temperanca;
    ImageView diabo;
    ImageView torre;
    ImageView estrela;
    ImageView lua;
    ImageView sol;
    ImageView julgamento;
    ImageView mundo;

    Random r;

    Button viracarta;
    Button voltartaro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taro);

        voltartaro = (Button) findViewById(R.id.idbotaovoltar);
        voltartaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltamain();
            }
        });

        viracarta = (Button) findViewById(R.id.idbotaotiracarta);
        viracarta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                pegacarta();
            }
        });
    }

    void voltamain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    void pegacarta(){
        Random r = new Random();
        int carta = r. nextInt(23 - 1) + 1;

        costas=(ImageView)findViewById(R.id.idcartatras);
        costas.setVisibility(View.GONE);

        louco=(ImageView)findViewById(R.id.idlouco);
        louco.setVisibility(View.GONE);

        mago=(ImageView)findViewById(R.id.idmago);
        mago.setVisibility(View.GONE);

        altasacerdotisa=(ImageView)findViewById(R.id.idaltasacerdotisa);
        altasacerdotisa.setVisibility(View.GONE);

        imperador=(ImageView)findViewById(R.id.idimperador);
        imperador.setVisibility(View.GONE);

        imperatriz=(ImageView)findViewById(R.id.idimperatriz);
        imperatriz.setVisibility(View.GONE);

        hierofante=(ImageView)findViewById(R.id.idhierofante);
        hierofante.setVisibility(View.GONE);

        enamorados=(ImageView)findViewById(R.id.idenamorados);
        enamorados.setVisibility(View.GONE);

        carro=(ImageView)findViewById(R.id.idcarro);
        carro.setVisibility(View.GONE);

        forca=(ImageView)findViewById(R.id.idforca);
        forca.setVisibility(View.GONE);

        eremita=(ImageView)findViewById(R.id.ideremita);
        eremita.setVisibility(View.GONE);

        rodadafortuna=(ImageView)findViewById(R.id.idrodadafortuna);
        rodadafortuna.setVisibility(View.GONE);

        justica=(ImageView)findViewById(R.id.idjustica);
        justica.setVisibility(View.GONE);

        pendurado=(ImageView)findViewById(R.id.idpendurado);
        pendurado.setVisibility(View.GONE);

        morte=(ImageView)findViewById(R.id.idmorte);
        morte.setVisibility(View.GONE);

        temperanca=(ImageView)findViewById(R.id.idtemperanca);
        temperanca.setVisibility(View.GONE);

        diabo=(ImageView)findViewById(R.id.iddiabo);
        diabo.setVisibility(View.GONE);

        torre=(ImageView)findViewById(R.id.idtorre);
        torre.setVisibility(View.GONE);

        estrela=(ImageView)findViewById(R.id.idestrela);
        estrela.setVisibility(View.GONE);

        lua=(ImageView)findViewById(R.id.idlua);
        lua.setVisibility(View.GONE);

        sol=(ImageView)findViewById(R.id.idsol);
        sol.setVisibility(View.GONE);

        julgamento=(ImageView)findViewById(R.id.idjulgamento);
        julgamento.setVisibility(View.GONE);

        mundo=(ImageView)findViewById(R.id.idmundo);
        mundo.setVisibility(View.GONE);

        //caso caia eles deixar visivel
        if(carta == 1) {
            costas=(ImageView)findViewById(R.id.idcartatras);
            costas.setVisibility(View.VISIBLE);}else
        if(carta == 2) {
            louco=(ImageView)findViewById(R.id.idlouco);
            louco.setVisibility(View.VISIBLE);}else
        if(carta == 3) {
            mago=(ImageView)findViewById(R.id.idmago);
            mago.setVisibility(View.VISIBLE);}else
        if(carta == 4) {
            altasacerdotisa=(ImageView)findViewById(R.id.idaltasacerdotisa);
            altasacerdotisa.setVisibility(View.VISIBLE);}else
        if(carta == 5) {
            imperador=(ImageView)findViewById(R.id.idimperador);
            imperador.setVisibility(View.VISIBLE);}else
        if(carta == 6) {
            imperatriz=(ImageView)findViewById(R.id.idimperatriz);
            imperatriz.setVisibility(View.VISIBLE);}else
        if(carta == 7) {
            hierofante=(ImageView)findViewById(R.id.idhierofante);
            hierofante.setVisibility(View.VISIBLE);}else
        if(carta == 8) {
            enamorados=(ImageView)findViewById(R.id.idenamorados);
            enamorados.setVisibility(View.VISIBLE);}else
        if(carta == 9) {
            carro=(ImageView)findViewById(R.id.idcarro);
            carro.setVisibility(View.VISIBLE);}else
        if(carta == 10) {
            forca=(ImageView)findViewById(R.id.idforca);
            forca.setVisibility(View.VISIBLE);}else
        if(carta == 11) {
            eremita=(ImageView)findViewById(R.id.ideremita);
            eremita.setVisibility(View.VISIBLE);}else
        if(carta == 12) {
            rodadafortuna=(ImageView)findViewById(R.id.idrodadafortuna);
            rodadafortuna.setVisibility(View.VISIBLE);}else
        if(carta == 13) {
            justica=(ImageView)findViewById(R.id.idjustica);
            justica.setVisibility(View.VISIBLE);}else
        if(carta == 14) {
            pendurado=(ImageView)findViewById(R.id.idpendurado);
            pendurado.setVisibility(View.VISIBLE);}else
        if(carta == 15) {
            morte=(ImageView)findViewById(R.id.idmorte);
            morte.setVisibility(View.VISIBLE);}else
        if(carta == 16) {
            temperanca=(ImageView)findViewById(R.id.idtemperanca);
            temperanca.setVisibility(View.VISIBLE);}else
        if(carta == 17) {
            diabo=(ImageView)findViewById(R.id.iddiabo);
            diabo.setVisibility(View.VISIBLE);}else
        if(carta == 18) {
            torre=(ImageView)findViewById(R.id.idtorre);
            torre.setVisibility(View.VISIBLE);}else
        if(carta == 19) {
            estrela=(ImageView)findViewById(R.id.idestrela);
            estrela.setVisibility(View.VISIBLE);}else
        if(carta == 20) {
            lua=(ImageView)findViewById(R.id.idlua);
            lua.setVisibility(View.VISIBLE);}else
        if(carta == 21) {
            sol=(ImageView)findViewById(R.id.idsol);
            sol.setVisibility(View.VISIBLE);}else
        if(carta == 22) {
            julgamento=(ImageView)findViewById(R.id.idjulgamento);
            julgamento.setVisibility(View.VISIBLE);}else
        if(carta == 23) {
            mundo=(ImageView)findViewById(R.id.idmundo);
            mundo.setVisibility(View.VISIBLE);}
    }
    void cartarevelada(){

    }
    void cartasdecostas(){

    }


}