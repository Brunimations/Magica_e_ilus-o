package com.example.magiquinhapog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class creditos extends AppCompatActivity {

    Button botaovoltarcreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        botaovoltarcreditos = (Button) findViewById(R.id.idbotaovoltarcreditos);
        botaovoltarcreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voltamain();
            }
        });
    }
    void voltamain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}