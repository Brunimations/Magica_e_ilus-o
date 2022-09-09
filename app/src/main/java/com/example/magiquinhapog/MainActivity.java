package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaobola8;
    Button botaotaro;
    Button botaocoelhoso;
    Button botaoadivinha;
    Button botaocreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaobola8=(Button) findViewById(R.id.botaobola8id);
        botaobola8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {irparabola8();}
        });

        botaotaro=(Button) findViewById(R.id.botaoidtaro);
        botaotaro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {irparataro();}
        });

        botaocoelhoso=(Button) findViewById(R.id.botaocoelhoid);
        botaocoelhoso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {irparacoelho();}
        });

        botaocreditos=(Button) findViewById(R.id.botaocreditosid);
        botaocreditos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {irparacreditos();}
        });

        botaoadivinha=(Button) findViewById(R.id.botaoadivinhaid);
        botaoadivinha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {irparaadivinha();}
        });
    }

    void irparabola8(){
        Intent intent = new Intent(this,bola8.class);
        startActivity(intent);
    }
    void irparataro(){
        Intent intent = new Intent(this,taro.class);
        startActivity(intent);
    }
    void irparacoelho(){
        Intent intent = new Intent(this,coelho.class);
        startActivity(intent);
    }
    void irparaadivinha(){
        Intent intent = new Intent(this,adivinha.class);
        startActivity(intent);
    }
    void irparacreditos(){
        Intent intent = new Intent(this,creditos.class);
        startActivity(intent);
    }
}